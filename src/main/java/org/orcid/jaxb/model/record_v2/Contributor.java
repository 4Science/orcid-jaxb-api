//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.24 at 11:17:38 AM CDT 
//


package org.orcid.jaxb.model.record_v2;

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
import org.orcid.jaxb.model.common_v2.CreditName;
import org.orcid.jaxb.model.common_v2.OrcidId;


/**
 * A collaborator or other contributor to a work or
 * 				other orcid-activity
 * 			
 * 
 * <p>Java class for contributor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contributor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}contributor-orcid" minOccurs="0"/&gt;
 *         &lt;element name="credit-name" type="{http://www.orcid.org/ns/common}credit-name" minOccurs="0"/&gt;
 *         &lt;element name="contributor-email" type="{http://www.orcid.org/ns/work}contributor-email" minOccurs="0"/&gt;
 *         &lt;element name="contributor-attributes" type="{http://www.orcid.org/ns/work}contributor-attributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contributor", namespace = "http://www.orcid.org/ns/work", propOrder = {
    "contributorOrcid",
    "creditName",
    "contributorEmail",
    "contributorAttributes"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
public class Contributor implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "contributor-orcid", namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected OrcidId contributorOrcid;
    @XmlElement(name = "credit-name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected CreditName creditName;
    @XmlElement(name = "contributor-email")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected ContributorEmail contributorEmail;
    @XmlElement(name = "contributor-attributes")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected ContributorAttributes contributorAttributes;

    /**
     * Default no-arg constructor
     * 
     */
    public Contributor() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Contributor(final OrcidId contributorOrcid, final CreditName creditName, final ContributorEmail contributorEmail, final ContributorAttributes contributorAttributes) {
        this.contributorOrcid = contributorOrcid;
        this.creditName = creditName;
        this.contributorEmail = contributorEmail;
        this.contributorAttributes = contributorAttributes;
    }

    /**
     * ORCID iD for the contributor
     * 
     * @return
     *     possible object is
     *     {@link OrcidId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public OrcidId getContributorOrcid() {
        return contributorOrcid;
    }

    /**
     * Sets the value of the contributorOrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcidId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setContributorOrcid(OrcidId value) {
        this.contributorOrcid = value;
    }

    /**
     * Gets the value of the creditName property.
     * 
     * @return
     *     possible object is
     *     {@link CreditName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public CreditName getCreditName() {
        return creditName;
    }

    /**
     * Sets the value of the creditName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setCreditName(CreditName value) {
        this.creditName = value;
    }

    /**
     * Gets the value of the contributorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorEmail }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public ContributorEmail getContributorEmail() {
        return contributorEmail;
    }

    /**
     * Sets the value of the contributorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorEmail }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setContributorEmail(ContributorEmail value) {
        this.contributorEmail = value;
    }

    /**
     * Gets the value of the contributorAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorAttributes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public ContributorAttributes getContributorAttributes() {
        return contributorAttributes;
    }

    /**
     * Sets the value of the contributorAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorAttributes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setContributorAttributes(ContributorAttributes value) {
        this.contributorAttributes = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            OrcidId theContributorOrcid;
            theContributorOrcid = this.getContributorOrcid();
            strategy.appendField(locator, this, "contributorOrcid", buffer, theContributorOrcid);
        }
        {
            CreditName theCreditName;
            theCreditName = this.getCreditName();
            strategy.appendField(locator, this, "creditName", buffer, theCreditName);
        }
        {
            ContributorEmail theContributorEmail;
            theContributorEmail = this.getContributorEmail();
            strategy.appendField(locator, this, "contributorEmail", buffer, theContributorEmail);
        }
        {
            ContributorAttributes theContributorAttributes;
            theContributorAttributes = this.getContributorAttributes();
            strategy.appendField(locator, this, "contributorAttributes", buffer, theContributorAttributes);
        }
        return buffer;
    }

}
