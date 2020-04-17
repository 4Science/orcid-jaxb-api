//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 09:44:26 AM CEST 
//


package org.orcid.jaxb.model.record_v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v3.LastModifiedDate;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}last-modified-date" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.orcid.org/ns/address}address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="path" type="{http://www.orcid.org/ns/common}element-path" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastModifiedDate",
    "address"
})
@XmlRootElement(name = "addresses", namespace = "http://www.orcid.org/ns/address")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
public class Addresses implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "last-modified-date", namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/address")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected List<AddressType> address;
    @XmlAttribute(name = "path")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected String path;

    /**
     * Default no-arg constructor
     * 
     */
    public Addresses() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Addresses(final LastModifiedDate lastModifiedDate, final List<AddressType> address, final String path) {
        this.lastModifiedDate = lastModifiedDate;
        this.address = address;
        this.path = path;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link LastModifiedDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastModifiedDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setLastModifiedDate(LastModifiedDate value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setPath(String value) {
        this.path = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setAddress(List<AddressType> value) {
        this.address = null;
        if (value!= null) {
            List<AddressType> draftl = this.getAddress();
            draftl.addAll(value);
        }
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            LastModifiedDate theLastModifiedDate;
            theLastModifiedDate = this.getLastModifiedDate();
            strategy.appendField(locator, this, "lastModifiedDate", buffer, theLastModifiedDate);
        }
        {
            List<AddressType> theAddress;
            theAddress = (((this.address!= null)&&(!this.address.isEmpty()))?this.getAddress():null);
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            String thePath;
            thePath = this.getPath();
            strategy.appendField(locator, this, "path", buffer, thePath);
        }
        return buffer;
    }

}
