//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.24 at 11:17:38 AM CDT 
//


package org.orcid.jaxb.model.common_v2;

import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.record_v2.ExternalIdentifier;


/**
 * A reference to an external identifier, suitable for works, people and funding. 
 * 				Supported external-id-type values can be found at https://pub.orcid.org/v2.0/identifiers
 * 			
 * 
 * <p>Java class for external-id complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="external-id"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orcid.org/ns/common}element-summary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="external-id-type" type="{http://www.orcid.org/ns/common}non-empty-string"/&gt;
 *         &lt;element name="external-id-value" type="{http://www.orcid.org/ns/common}non-empty-string"/&gt;
 *         &lt;element name="external-id-url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="external-id-relationship" type="{http://www.orcid.org/ns/common}relationship-type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "external-id", propOrder = {
    "externalIdType",
    "externalIdValue",
    "externalIdUrl",
    "externalIdRelationship"
})
@XmlSeeAlso({
    ExternalIdentifier.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
public class ExternalId
    extends ElementSummary
    implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "external-id-type", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected String externalIdType;
    @XmlElement(name = "external-id-value", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected String externalIdValue;
    @XmlElement(name = "external-id-url")
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected String externalIdUrl;
    @XmlElement(name = "external-id-relationship")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected RelationshipType externalIdRelationship;

    /**
     * Default no-arg constructor
     * 
     */
    public ExternalId() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ExternalId(final CreatedDate createdDate, final LastModifiedDate lastModifiedDate, final SourceType source, final BigInteger putCode, final Visibility visibility, final String displayIndex, final String path, final String externalIdType, final String externalIdValue, final String externalIdUrl, final RelationshipType externalIdRelationship) {
        super(createdDate, lastModifiedDate, source, putCode, visibility, displayIndex, path);
        this.externalIdType = externalIdType;
        this.externalIdValue = externalIdValue;
        this.externalIdUrl = externalIdUrl;
        this.externalIdRelationship = externalIdRelationship;
    }

    /**
     * Gets the value of the externalIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public String getExternalIdType() {
        return externalIdType;
    }

    /**
     * Sets the value of the externalIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setExternalIdType(String value) {
        this.externalIdType = value;
    }

    /**
     * Gets the value of the externalIdValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public String getExternalIdValue() {
        return externalIdValue;
    }

    /**
     * Sets the value of the externalIdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setExternalIdValue(String value) {
        this.externalIdValue = value;
    }

    /**
     * Gets the value of the externalIdUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public String getExternalIdUrl() {
        return externalIdUrl;
    }

    /**
     * Sets the value of the externalIdUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setExternalIdUrl(String value) {
        this.externalIdUrl = value;
    }

    /**
     * Gets the value of the externalIdRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public RelationshipType getExternalIdRelationship() {
        return externalIdRelationship;
    }

    /**
     * Sets the value of the externalIdRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setExternalIdRelationship(RelationshipType value) {
        this.externalIdRelationship = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String theExternalIdType;
            theExternalIdType = this.getExternalIdType();
            strategy.appendField(locator, this, "externalIdType", buffer, theExternalIdType);
        }
        {
            String theExternalIdValue;
            theExternalIdValue = this.getExternalIdValue();
            strategy.appendField(locator, this, "externalIdValue", buffer, theExternalIdValue);
        }
        {
            String theExternalIdUrl;
            theExternalIdUrl = this.getExternalIdUrl();
            strategy.appendField(locator, this, "externalIdUrl", buffer, theExternalIdUrl);
        }
        {
            RelationshipType theExternalIdRelationship;
            theExternalIdRelationship = this.getExternalIdRelationship();
            strategy.appendField(locator, this, "externalIdRelationship", buffer, theExternalIdRelationship);
        }
        return buffer;
    }

}
