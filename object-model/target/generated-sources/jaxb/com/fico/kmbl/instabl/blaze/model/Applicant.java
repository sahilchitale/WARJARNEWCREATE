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
 * <p>Java class for Applicant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Applicant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="borrowerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="residentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ageInYrs" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ncifStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isExistingCustomer" type="{}FlagEnum"/>
 *         &lt;element name="addressDetails" type="{}Address" maxOccurs="unbounded"/>
 *         &lt;element name="customBureauResponse" type="{}CustomBureauResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Applicant", propOrder = {
    "borrowerName",
    "residentType",
    "applicantType",
    "applicantId",
    "customerProfile",
    "entityType",
    "dateOfBirth",
    "ageInYrs",
    "gender",
    "ncifStatus",
    "isExistingCustomer",
    "addressDetails",
    "customBureauResponse"
})
public class Applicant
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    @XmlElement(required = true)
    protected String borrowerName;
    protected String residentType;
    @XmlElement(required = true)
    protected String applicantType;
    @XmlElement(required = true)
    protected String applicantId;
    @XmlElement(required = true)
    protected String customerProfile;
    @XmlElement(required = true)
    protected String entityType;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date dateOfBirth;
    protected double ageInYrs;
    protected String gender;
    protected String ncifStatus;
    @XmlElement(required = true)
    protected FlagEnum isExistingCustomer;
    @XmlElement(required = true)
    protected com.fico.kmbl.instabl.blaze.model.Address[] addressDetails;
    protected CustomBureauResponse customBureauResponse;

    /**
     * Gets the value of the borrowerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerName() {
        return borrowerName;
    }

    /**
     * Sets the value of the borrowerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerName(String value) {
        this.borrowerName = value;
    }

    /**
     * Gets the value of the residentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentType() {
        return residentType;
    }

    /**
     * Sets the value of the residentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentType(String value) {
        this.residentType = value;
    }

    /**
     * Gets the value of the applicantType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantType() {
        return applicantType;
    }

    /**
     * Sets the value of the applicantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantType(String value) {
        this.applicantType = value;
    }

    /**
     * Gets the value of the applicantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * Sets the value of the applicantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantId(String value) {
        this.applicantId = value;
    }

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProfile(String value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(Date value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the ageInYrs property.
     * 
     */
    public double getAgeInYrs() {
        return ageInYrs;
    }

    /**
     * Sets the value of the ageInYrs property.
     * 
     */
    public void setAgeInYrs(double value) {
        this.ageInYrs = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the ncifStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcifStatus() {
        return ncifStatus;
    }

    /**
     * Sets the value of the ncifStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcifStatus(String value) {
        this.ncifStatus = value;
    }

    /**
     * Gets the value of the isExistingCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link FlagEnum }
     *     
     */
    public FlagEnum getIsExistingCustomer() {
        return isExistingCustomer;
    }

    /**
     * Sets the value of the isExistingCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagEnum }
     *     
     */
    public void setIsExistingCustomer(FlagEnum value) {
        this.isExistingCustomer = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link com.fico.kmbl.instabl.blaze.model.Address }
     *     
     */
    public com.fico.kmbl.instabl.blaze.model.Address[] getAddressDetails() {
        if (this.addressDetails == null) {
            return new com.fico.kmbl.instabl.blaze.model.Address[ 0 ] ;
        }
        com.fico.kmbl.instabl.blaze.model.Address[] retVal = new com.fico.kmbl.instabl.blaze.model.Address[this.addressDetails.length] ;
        System.arraycopy(this.addressDetails, 0, retVal, 0, this.addressDetails.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link com.fico.kmbl.instabl.blaze.model.Address }
     *     
     */
    public com.fico.kmbl.instabl.blaze.model.Address getAddressDetails(int idx) {
        if (this.addressDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.addressDetails[idx];
    }

    public int getAddressDetailsLength() {
        if (this.addressDetails == null) {
            return  0;
        }
        return this.addressDetails.length;
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link com.fico.kmbl.instabl.blaze.model.Address }
     *     
     */
    public void setAddressDetails(com.fico.kmbl.instabl.blaze.model.Address[] values) {
        int len = values.length;
        this.addressDetails = ((com.fico.kmbl.instabl.blaze.model.Address[]) new com.fico.kmbl.instabl.blaze.model.Address[len] );
        for (int i = 0; (i<len); i ++) {
            this.addressDetails[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link com.fico.kmbl.instabl.blaze.model.Address }
     *     
     */
    public com.fico.kmbl.instabl.blaze.model.Address setAddressDetails(int idx, com.fico.kmbl.instabl.blaze.model.Address value) {
        return this.addressDetails[idx] = value;
    }

    /**
     * Gets the value of the customBureauResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CustomBureauResponse }
     *     
     */
    public CustomBureauResponse getCustomBureauResponse() {
        return customBureauResponse;
    }

    /**
     * Sets the value of the customBureauResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomBureauResponse }
     *     
     */
    public void setCustomBureauResponse(CustomBureauResponse value) {
        this.customBureauResponse = value;
    }

}