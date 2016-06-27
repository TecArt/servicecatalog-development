/*******************************************************************************
 *                                                                              
 *  Copyright FUJITSU LIMITED 2016                                             
 *                                                                              
 *  Author: kowalczyka                                                      
 *                                                                              
 *  Creation Date: 18.05.2016                                                      
 *                                                                              
 *******************************************************************************/

package org.oscm.ui.dialog.classic.marketplace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.SelectItem;

import org.oscm.internal.intf.MarketplaceService;
import org.oscm.internal.marketplace.POOrganization;
import org.oscm.internal.types.exception.ObjectNotFoundException;
import org.oscm.internal.types.exception.SaaSApplicationException;
import org.oscm.internal.vo.VOMarketplace;
import org.oscm.internal.vo.VOOrganization;
import org.oscm.ui.beans.BaseBean;
import org.oscm.ui.common.JSFUtils;
import org.oscm.ui.common.UiDelegate;

@ManagedBean
@ViewScoped
public class ManageAccessCtrl {

    private UiDelegate ui;

    @ManagedProperty(value = "#{manageAccessModel}")
    private ManageAccessModel model;

    @EJB
    private MarketplaceService marketplaceService;

    public ManageAccessCtrl() {
        ui = new UiDelegate();
    }

    @PostConstruct
    public void initialize() {
        initSelectableMarketplaces();
    }

    public void initSelectableMarketplaces() {

        List<VOMarketplace> marketplaces = marketplaceService
                .getMarketplacesOwned();

        List<SelectItem> selectableMarketplaces = new ArrayList<SelectItem>();

        for (VOMarketplace mp : marketplaces) {
            selectableMarketplaces
                    .add(new SelectItem(mp.getMarketplaceId(), String.format(
                            "%s (%s)", mp.getName(), mp.getMarketplaceId())));
        }

        model.setSelectableMarketplaces(selectableMarketplaces);
    }

    public void marketplaceChanged() {
        String marketplaceId = model.getSelectedMarketplaceId();

        if (marketplaceId == null) {
            model.setSelectedMarketplaceRestricted(false);
            return;
        }
        try {
            VOMarketplace marketplace = marketplaceService
                    .getMarketplaceById(marketplaceId);            
            
            model.setSelectedMarketplaceRestricted(marketplace.isRestricted());           
            
            if(marketplace.isRestricted()){
                model.setShowOpeningRestrictedMplWarning(true);
            }    
            populateOrganizations(marketplaceId);
        } catch (ObjectNotFoundException e) {
            e.printStackTrace();
            ui.handleException(e);
        }
    }

    public void accessChanged() {
        try {
            populateOrganizations(model.getSelectedMarketplaceId());
        } catch (ObjectNotFoundException e) {
            e.printStackTrace();
            ui.handleException(e);
        }
    }

    private void populateOrganizations(String marketplaceId) throws ObjectNotFoundException {

        boolean restricted = model.isSelectedMarketplaceRestricted();

        // no need to populate organization list when selected marketplace is
        // not restricted
        if (restricted) {
            List<POOrganization> organizations = new ArrayList<>();
            Map<Long, Boolean> accessesStored = new HashMap<>();
            Map<Long, Boolean> accessesSelected = new HashMap<>();
            
            for (VOOrganization voOrganization : marketplaceService
                    .getAllOrganizations(marketplaceId)) {
                POOrganization poOrganization = toPOOrganization(
                        voOrganization);
                
                long key = poOrganization.getKey();
                organizations.add(poOrganization);
                
                accessesStored.put(Long.valueOf(key), Boolean.valueOf(voOrganization.isHasGrantedAccessToMarketplace()));
                accessesSelected.put(Long.valueOf(key), Boolean.valueOf(poOrganization.isSelected()));
            }
            model.setOrganizations(organizations);
            model.setAccessesStored(accessesStored);
            model.setAccessesSelected(accessesSelected);
        }
    }

    public String save() {
        try {
            if (model.isSelectedMarketplaceRestricted()) {
                prepareOrganizationsListsForUpdate();
                getMarketplaceService().closeMarketplace(
                        model.getSelectedMarketplaceId(),
                        model.getAuthorizedOrganizations(),
                        model.getUnauthorizedOrganizations(),
                        model.getOrganizationsWithSubscriptionsToSuspend());
            } else {
                getMarketplaceService()
                        .openMarketplace(model.getSelectedMarketplaceId());
            }
            addMessage(BaseBean.INFO_MARKETPLACE_ACCESS_SAVED);
            populateOrganizations(model.getSelectedMarketplaceId());
            clearOrganizationsForUpdate();
        } catch (SaaSApplicationException e) {
            e.printStackTrace();
            ui.handleException(e);
        }

        return BaseBean.OUTCOME_SUCCESS;
    }
    
    private void clearOrganizationsForUpdate(){
        model.getAuthorizedOrganizations().clear();
        model.getUnauthorizedOrganizations().clear();
        model.getOrganizationsWithSubscriptionsToSuspend().clear();
    }
    
    private void prepareOrganizationsListsForUpdate() {

        for (POOrganization poOrganization : model.getOrganizations()) {
            
            long orgKey = poOrganization.getKey();
            boolean orgIsSelected = poOrganization.isSelected();
            
            if (model.getAccessesStored().get(orgKey)&& !orgIsSelected) {
                model.getUnauthorizedOrganizations().add(orgKey);
                model.getOrganizationsWithSubscriptionsToSuspend().add(orgKey);
                continue;
            }
            if (!model.getAccessesStored().get(orgKey)&& orgIsSelected) {
                model.getAuthorizedOrganizations().add(orgKey);
            }    
        }
    }

    public void organizationAccessChanged(AjaxBehaviorEvent event) {

        POOrganization organization = (POOrganization) event.getComponent()
                .getAttributes().get("organization");

        if (model.getAccessesSelected().get(organization.getKey())) {
            if (!organization.isSelected()) {
                model.getOrganizationsWithSubscriptionsToSuspend()
                        .add(organization.getKey());
            } else {
                model.getOrganizationsWithSubscriptionsToSuspend()
                        .remove(organization.getKey());
            }
            model.setShowSubscriptionSuspendingWarning(model
                    .getOrganizationsWithSubscriptionsToSuspend().size() > 0);
        }
    }

    public void allOrganizationSelected(AjaxBehaviorEvent event) {

        /*boolean allOrganizationsSelected = model.isAllOrganizationsSelected();
        if (allOrganizationsSelected) {
            model.getOrganizationsToBeRemoved().clear();
        } else {
            List<POOrganization> allOrganizations = model.getOrganizations();

            for (POOrganization organization : allOrganizations) {
                if (organization.isSelected()) {
                    model.getOrganizationsToBeRemoved()
                            .add(organization.getOrganizationId());
                }
            }
        }*/
    }

    public void addMessage(final String messageText) {
        JSFUtils.addMessage(null, FacesMessage.SEVERITY_INFO, messageText,
                null);
    }

    private POOrganization toPOOrganization(VOOrganization voOrganization) {
        POOrganization poOrganization = new POOrganization(
                voOrganization.getName(), voOrganization.getOrganizationId());
        poOrganization.setKey(voOrganization.getKey());
        poOrganization
                .setSelected(voOrganization.isHasGrantedAccessToMarketplace()
                        || voOrganization.isHasSubscriptions());
        return poOrganization;
    }

    public ManageAccessModel getModel() {
        return model;
    }

    public void setModel(ManageAccessModel model) {
        this.model = model;
    }

    public MarketplaceService getMarketplaceService() {
        return marketplaceService;
    }

    public void setMarketplaceService(MarketplaceService marketplaceService) {
        this.marketplaceService = marketplaceService;
    }
}
