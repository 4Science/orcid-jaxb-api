//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 07:22:19 PM CEST 
//


package org.orcid.jaxb.model.record_v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Container for resources
 * 			
 * 
 * <p>Java class for resource-items complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource-items"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resource-item" type="{http://www.orcid.org/ns/research-resource}resource-item" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource-items", namespace = "http://www.orcid.org/ns/research-resource", propOrder = {
    "resourceItem"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
public class ResearchResourceItems implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "resource-item", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    protected List<ResearchResourceItem> resourceItem;

    /**
     * Default no-arg constructor
     * 
     */
    public ResearchResourceItems() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ResearchResourceItems(final List<ResearchResourceItem> resourceItem) {
        this.resourceItem = resourceItem;
    }

    /**
     * Gets the value of the resourceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResearchResourceItem }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public List<ResearchResourceItem> getResourceItem() {
        if (resourceItem == null) {
            resourceItem = new ArrayList<ResearchResourceItem>();
        }
        return this.resourceItem;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public void setResourceItem(List<ResearchResourceItem> value) {
        this.resourceItem = null;
        if (value!= null) {
            List<ResearchResourceItem> draftl = this.getResourceItem();
            draftl.addAll(value);
        }
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<ResearchResourceItem> theResourceItem;
            theResourceItem = (((this.resourceItem!= null)&&(!this.resourceItem.isEmpty()))?this.getResourceItem():null);
            strategy.appendField(locator, this, "resourceItem", buffer, theResourceItem);
        }
        return buffer;
    }

}
