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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * True if the researcher or contributor has added a
 * 				password
 * 				to assume ownership of their ORCID Record after bulk
 * 				creation
 * 				by their institution.
 * 			
 * 
 * <p>Java class for claimed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="claimed"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimed", namespace = "http://www.orcid.org/ns/history", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
public class Claimed implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlValue
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected boolean value;

    /**
     * Default no-arg constructor
     * 
     */
    public Claimed() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Claimed(final boolean value) {
        this.value = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setValue(boolean value) {
        this.value = value;
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
            boolean theValue;
            theValue = this.isValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        return buffer;
    }

}
