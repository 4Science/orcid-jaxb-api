//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 07:22:19 PM CEST 
//


package org.orcid.jaxb.model.record_v3;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v3.ExternalIds;
import org.orcid.jaxb.model.common_v3.Url;


/**
 * Actual resources used
 * 			
 * 
 * <p>Java class for resource-item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource-item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resource-name" type="{http://www.orcid.org/ns/common}string-1000"/&gt;
 *         &lt;element name="resource-type" type="{http://www.orcid.org/ns/research-resource}resource-type"/&gt;
 *         &lt;element name="hosts" type="{http://www.orcid.org/ns/research-resource}hosts"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}external-ids"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}url" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource-item", namespace = "http://www.orcid.org/ns/research-resource", propOrder = {
    "resourceName",
    "resourceType",
    "hosts",
    "externalIds",
    "url"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
public class ResearchResourceItem implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "resource-name", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    protected String resourceName;
    @XmlElement(name = "resource-type", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    protected String resourceType;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    protected ResearchResourceHosts hosts;
    @XmlElement(name = "external-ids", namespace = "http://www.orcid.org/ns/common", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    protected ExternalIds externalIds;
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    protected Url url;

    /**
     * Default no-arg constructor
     * 
     */
    public ResearchResourceItem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ResearchResourceItem(final String resourceName, final String resourceType, final ResearchResourceHosts hosts, final ExternalIds externalIds, final Url url) {
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.hosts = hosts;
        this.externalIds = externalIds;
        this.url = url;
    }

    /**
     * Gets the value of the resourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public void setResourceType(String value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the hosts property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchResourceHosts }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public ResearchResourceHosts getHosts() {
        return hosts;
    }

    /**
     * Sets the value of the hosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchResourceHosts }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public void setHosts(ResearchResourceHosts value) {
        this.hosts = value;
    }

    /**
     * Gets the value of the externalIds property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIds }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    /**
     * Sets the value of the externalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIds }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public void setExternalIds(ExternalIds value) {
        this.externalIds = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public Url getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public void setUrl(Url value) {
        this.url = value;
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
            String theResourceName;
            theResourceName = this.getResourceName();
            strategy.appendField(locator, this, "resourceName", buffer, theResourceName);
        }
        {
            String theResourceType;
            theResourceType = this.getResourceType();
            strategy.appendField(locator, this, "resourceType", buffer, theResourceType);
        }
        {
            ResearchResourceHosts theHosts;
            theHosts = this.getHosts();
            strategy.appendField(locator, this, "hosts", buffer, theHosts);
        }
        {
            ExternalIds theExternalIds;
            theExternalIds = this.getExternalIds();
            strategy.appendField(locator, this, "externalIds", buffer, theExternalIds);
        }
        {
            Url theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        return buffer;
    }

}
