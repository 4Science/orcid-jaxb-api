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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * An error that populated by ORCID when record is read
 * 			
 * 
 * <p>Java class for transient-error complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transient-error"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error-code" type="{http://www.orcid.org/ns/common}non-empty-string" minOccurs="0"/&gt;
 *         &lt;element name="error-message" type="{http://www.orcid.org/ns/common}non-empty-string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="transient" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;pattern value="true"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transient-error", propOrder = {
    "errorCode",
    "errorMessage"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
public class TransientError implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "error-code")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected String errorCode;
    @XmlElement(name = "error-message")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected String errorMessage;
    @XmlAttribute(name = "transient", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    protected boolean _transient;

    /**
     * Default no-arg constructor
     * 
     */
    public TransientError() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TransientError(final String errorCode, final String errorMessage, final boolean _transient) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this._transient = _transient;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the transient property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public boolean isTransient() {
        return _transient;
    }

    /**
     * Sets the value of the transient property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T09:44:26+02:00", comments = "JAXB RI v2.2.11")
    public void setTransient(boolean value) {
        this._transient = value;
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
            String theErrorCode;
            theErrorCode = this.getErrorCode();
            strategy.appendField(locator, this, "errorCode", buffer, theErrorCode);
        }
        {
            String theErrorMessage;
            theErrorMessage = this.getErrorMessage();
            strategy.appendField(locator, this, "errorMessage", buffer, theErrorMessage);
        }
        {
            boolean theTransient;
            theTransient = this.isTransient();
            strategy.appendField(locator, this, "_transient", buffer, theTransient);
        }
        return buffer;
    }

}
