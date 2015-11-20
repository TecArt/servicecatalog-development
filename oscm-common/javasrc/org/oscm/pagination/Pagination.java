/*******************************************************************************
 *
 *  Copyright FUJITSU LIMITED 2015                                           
 *                                                                                                                                  
 *  Creation Date: 20.07.15 16:44
 *
 *******************************************************************************/

package org.oscm.pagination;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.oscm.internal.types.enumtypes.SubscriptionStatus;
import org.oscm.internal.types.enumtypes.UnitRoleType;

/**
 * Common Pagination class with filtering and sorting options.
 */
public class Pagination implements Serializable {
    
    private static final long serialVersionUID = 5658910751349761L;
    private int offset;
    private int limit;
    private Sorting sorting;
    private Set<Filter> filterSet;
    private String dateFormat;
    private Map<UnitRoleType, String> localizedRolesMap;
    
    public Pagination(int offset, int limit) {
        this();
        this.offset = offset;
        this.limit = limit;
    }
    
    public Pagination() {
        localizedRolesMap = new HashMap<>();
    }
    
    public int getOffset() {
        return offset;
    }
    
    public void setOffset(int offset) {
        this.offset = offset;
    }
    
    public int getLimit() {
        return limit;
    }
    
    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    public Sorting getSorting() {
        return sorting;
    }
    
    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }
    
    public Set<Filter> getFilterSet() {
        return filterSet;
    }
    
    public void setFilterSet(Set<Filter> filterSet) {
        this.filterSet = filterSet;
    }
    
    public String getDateFormat() {
        return dateFormat;
    }
    
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public Map<UnitRoleType, String> getLocalizedRolesMap() {
        return localizedRolesMap;
    }
}
