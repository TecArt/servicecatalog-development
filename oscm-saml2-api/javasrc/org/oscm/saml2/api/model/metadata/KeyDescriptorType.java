/*******************************************************************************
 *  Copyright FUJITSU LIMITED 2017
 *******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.22 at 03:29:00 PM CEST 
//

package org.oscm.saml2.api.model.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.oscm.saml2.api.model.xmldsig.KeyInfoType;
import org.oscm.saml2.api.model.xmlenc.EncryptionMethodType;

/**
 * <p>
 * Java class for KeyDescriptorType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="KeyDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}EncryptionMethod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{urn:oasis:names:tc:SAML:2.0:metadata}KeyTypes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyDescriptorType", propOrder = { "keyInfo",
        "encryptionMethod" })
public class KeyDescriptorType {

    @XmlElement(name = "KeyInfo", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected KeyInfoType keyInfo;
    @XmlElement(name = "EncryptionMethod")
    protected List<EncryptionMethodType> encryptionMethod;
    @XmlAttribute(name = "use")
    protected KeyTypes use;

    /**
     * Gets the value of the keyInfo property.
     * 
     * @return possible object is {@link KeyInfoType }
     * 
     */
    public KeyInfoType getKeyInfo() {
        return keyInfo;
    }

    /**
     * Sets the value of the keyInfo property.
     * 
     * @param value
     *            allowed object is {@link KeyInfoType }
     * 
     */
    public void setKeyInfo(KeyInfoType value) {
        this.keyInfo = value;
    }

    /**
     * Gets the value of the encryptionMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the encryptionMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEncryptionMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionMethodType }
     * 
     * 
     */
    public List<EncryptionMethodType> getEncryptionMethod() {
        if (encryptionMethod == null) {
            encryptionMethod = new ArrayList<EncryptionMethodType>();
        }
        return this.encryptionMethod;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return possible object is {@link KeyTypes }
     * 
     */
    public KeyTypes getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *            allowed object is {@link KeyTypes }
     * 
     */
    public void setUse(KeyTypes value) {
        this.use = value;
    }

}
