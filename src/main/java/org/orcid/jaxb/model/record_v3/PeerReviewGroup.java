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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v3.ExternalIds;
import org.orcid.jaxb.model.common_v3.LastModifiedDate;


/**
 * <p>Java class for peer-review-group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="peer-review-group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}last-modified-date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}external-ids"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="peer-review-group" type="{http://www.orcid.org/ns/activities}peer-review-duplicates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peer-review-group", propOrder = {
    "lastModifiedDate",
    "externalIds",
    "peerReviewGroup"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
public class PeerReviewGroup implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "last-modified-date", namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(name = "external-ids", namespace = "http://www.orcid.org/ns/common", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected ExternalIds externalIds;
    @XmlElement(name = "peer-review-group")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected List<PeerReviewDuplicates> peerReviewGroup;

    /**
     * Default no-arg constructor
     * 
     */
    public PeerReviewGroup() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PeerReviewGroup(final LastModifiedDate lastModifiedDate, final ExternalIds externalIds, final List<PeerReviewDuplicates> peerReviewGroup) {
        this.lastModifiedDate = lastModifiedDate;
        this.externalIds = externalIds;
        this.peerReviewGroup = peerReviewGroup;
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
     * Gets the value of the externalIds property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIds }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setExternalIds(ExternalIds value) {
        this.externalIds = value;
    }

    /**
     * Gets the value of the peerReviewGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peerReviewGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeerReviewGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeerReviewDuplicates }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public List<PeerReviewDuplicates> getPeerReviewGroup() {
        if (peerReviewGroup == null) {
            peerReviewGroup = new ArrayList<PeerReviewDuplicates>();
        }
        return this.peerReviewGroup;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setPeerReviewGroup(List<PeerReviewDuplicates> value) {
        this.peerReviewGroup = null;
        if (value!= null) {
            List<PeerReviewDuplicates> draftl = this.getPeerReviewGroup();
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
            ExternalIds theExternalIds;
            theExternalIds = this.getExternalIds();
            strategy.appendField(locator, this, "externalIds", buffer, theExternalIds);
        }
        {
            List<PeerReviewDuplicates> thePeerReviewGroup;
            thePeerReviewGroup = (((this.peerReviewGroup!= null)&&(!this.peerReviewGroup.isEmpty()))?this.getPeerReviewGroup():null);
            strategy.appendField(locator, this, "peerReviewGroup", buffer, thePeerReviewGroup);
        }
        return buffer;
    }

}
