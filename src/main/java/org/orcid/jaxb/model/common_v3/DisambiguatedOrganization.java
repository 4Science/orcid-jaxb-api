//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 09:44:26 AM CEST 
//


package org.orcid.jaxb.model.common_v3;

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


/**
 * A reference to a disambiguated version the
 * 				organization to which the researcher or contributor is affiliated.
 * 				The list of disambiguated organizations come from ORCID partners
 * 				such as Ringgold, ISNI and FundRef.
 * 			
 * 
 * <p>Java class for disambiguated-organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disambiguated-organization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disambiguated-organization-identifier" type="{http://www.orcid.org/ns/common}short-text"/&gt;
 *         &lt;element name="disambiguation-source" type="{http://www.orcid.org/ns/common}short-text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disambiguated-organization", propOrder = {
    "disambiguatedOrganizationIdentifier",
    "disambiguationSource"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
public class DisambiguatedOrganization implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "disambiguated-organization-identifier", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected String disambiguatedOrganizationIdentifier;
    @XmlElement(name = "disambiguation-source", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected String disambiguationSource;

    /**
     * Default no-arg constructor
     * 
     */
    public DisambiguatedOrganization() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DisambiguatedOrganization(final String disambiguatedOrganizationIdentifier, final String disambiguationSource) {
        this.disambiguatedOrganizationIdentifier = disambiguatedOrganizationIdentifier;
        this.disambiguationSource = disambiguationSource;
    }

    /**
     * Gets the value of the disambiguatedOrganizationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public String getDisambiguatedOrganizationIdentifier() {
        return disambiguatedOrganizationIdentifier;
    }

    /**
     * Sets the value of the disambiguatedOrganizationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setDisambiguatedOrganizationIdentifier(String value) {
        this.disambiguatedOrganizationIdentifier = value;
    }

    /**
     * Gets the value of the disambiguationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public String getDisambiguationSource() {
        return disambiguationSource;
    }

    /**
     * Sets the value of the disambiguationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setDisambiguationSource(String value) {
        this.disambiguationSource = value;
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
            String theDisambiguatedOrganizationIdentifier;
            theDisambiguatedOrganizationIdentifier = this.getDisambiguatedOrganizationIdentifier();
            strategy.appendField(locator, this, "disambiguatedOrganizationIdentifier", buffer, theDisambiguatedOrganizationIdentifier);
        }
        {
            String theDisambiguationSource;
            theDisambiguationSource = this.getDisambiguationSource();
            strategy.appendField(locator, this, "disambiguationSource", buffer, theDisambiguationSource);
        }
        return buffer;
    }

}
