//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 09:44:26 AM CEST 
//


package org.orcid.jaxb.model.record_v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;
import org.orcid.jaxb.model.common_v3.AffiliationSummary;

@XmlRootElement(name = "EmploymentSummary")
public class EmploymentSummary
    extends JAXBElement<AffiliationSummary>
{

    protected final static QName NAME = new QName("http://www.orcid.org/ns/employment", "employment-summary");

    public EmploymentSummary(AffiliationSummary value) {
        super(NAME, ((Class) AffiliationSummary.class), null, value);
    }

    public EmploymentSummary() {
        super(NAME, ((Class) AffiliationSummary.class), null, null);
    }

}
