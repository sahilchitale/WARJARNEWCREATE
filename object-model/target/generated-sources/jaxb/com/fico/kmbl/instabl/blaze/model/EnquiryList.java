//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.13 at 12:59:57 PM IST 
//


package com.fico.kmbl.instabl.blaze.model;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for enquiryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enquiryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateReported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enquiryAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="enquiryPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportingMemberShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateReportedInDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="enquiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enquriyPurposeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enquiryList", propOrder = {
    "dateReported",
    "enquiryAmount",
    "enquiryPurpose",
    "reportingMemberShortName",
    "dateReportedInDate",
    "enquiryDate",
    "enquriyPurposeCode"
})
public class EnquiryList
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    protected String dateReported;
    protected Double enquiryAmount;
    protected String enquiryPurpose;
    protected String reportingMemberShortName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date dateReportedInDate;
    protected String enquiryDate;
    @XmlElement(required = true)
    protected String enquriyPurposeCode;

    /**
     * Gets the value of the dateReported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReported() {
        return dateReported;
    }

    /**
     * Sets the value of the dateReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReported(String value) {
        this.dateReported = value;
    }

    /**
     * Gets the value of the enquiryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnquiryAmount() {
        return enquiryAmount;
    }

    /**
     * Sets the value of the enquiryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnquiryAmount(Double value) {
        this.enquiryAmount = value;
    }

    /**
     * Gets the value of the enquiryPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnquiryPurpose() {
        return enquiryPurpose;
    }

    /**
     * Sets the value of the enquiryPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnquiryPurpose(String value) {
        this.enquiryPurpose = value;
    }

    /**
     * Gets the value of the reportingMemberShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingMemberShortName() {
        return reportingMemberShortName;
    }

    /**
     * Sets the value of the reportingMemberShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingMemberShortName(String value) {
        this.reportingMemberShortName = value;
    }

    /**
     * Gets the value of the dateReportedInDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateReportedInDate() {
        return dateReportedInDate;
    }

    /**
     * Sets the value of the dateReportedInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReportedInDate(Date value) {
        this.dateReportedInDate = value;
    }

    /**
     * Gets the value of the enquiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnquiryDate() {
        return enquiryDate;
    }

    /**
     * Sets the value of the enquiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnquiryDate(String value) {
        this.enquiryDate = value;
    }

    /**
     * Gets the value of the enquriyPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnquriyPurposeCode() {
        return enquriyPurposeCode;
    }

    /**
     * Sets the value of the enquriyPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnquriyPurposeCode(String value) {
        this.enquriyPurposeCode = value;
    }

}
