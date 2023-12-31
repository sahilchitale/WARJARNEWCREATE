//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.13 at 12:59:57 PM IST 
//


package com.fico.kmbl.instabl.blaze.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportingMemberShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownershipIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOpenedOrDisbursed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfLastPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateClosed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateReportedAndCertified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highCreditOrSanctionedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="overdueAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paymentHistory1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentHistory2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentHistoryStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentHistoryEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suitFiledOrWilfulDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="writtenOffAndSettledStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueOfCollateral" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="typeOfCollateral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cashLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rateOfInterest" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="repaymentTenure" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="emiAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="writtenOffAmountTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="writtenOffAmountPrincipal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="settlementAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paymentFrequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dateOfEntryForErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfEntryForCibilRemarksCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cibilRemarkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfEntryForErrorOrDisputeRemarksCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorOrDisputeRemarksCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorOrDisputeRemarksCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instituteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disbursedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="highCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sanctionAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lastPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="closureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daysPastDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disputeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountRelationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountRelation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="swwStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="swwStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="swwStatusAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountList", propOrder = {
    "reportingMemberShortName",
    "accountNumber",
    "accountType",
    "ownershipIndicator",
    "dateOpenedOrDisbursed",
    "dateOfLastPayment",
    "dateClosed",
    "dateReportedAndCertified",
    "highCreditOrSanctionedAmount",
    "currentBalance",
    "overdueAmount",
    "paymentHistory1",
    "paymentHistory2",
    "paymentHistoryStartDate",
    "paymentHistoryEndDate",
    "suitFiledOrWilfulDefault",
    "writtenOffAndSettledStatus",
    "valueOfCollateral",
    "typeOfCollateral",
    "creditLimit",
    "cashLimit",
    "rateOfInterest",
    "repaymentTenure",
    "emiAmount",
    "writtenOffAmountTotal",
    "writtenOffAmountPrincipal",
    "settlementAmount",
    "paymentFrequence",
    "actualPaymentAmount",
    "dateOfEntryForErrorCode",
    "errorCode",
    "dateOfEntryForCibilRemarksCode",
    "cibilRemarkCode",
    "dateOfEntryForErrorOrDisputeRemarksCode",
    "errorOrDisputeRemarksCode1",
    "errorOrDisputeRemarksCode2",
    "instituteName",
    "disbursedAmount",
    "highCredit",
    "sanctionAmount",
    "lastPaymentAmount",
    "closureReason",
    "daysPastDue",
    "assetClassification",
    "accountStatus",
    "disputeCode",
    "paymentRating",
    "accountTypeCode",
    "accountRelationCode",
    "accountRelation",
    "swwStatusCode",
    "swwStatus",
    "swwStatusAmount"
})
public class AccountList
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    protected String reportingMemberShortName;
    protected String accountNumber;
    protected String accountType;
    protected String ownershipIndicator;
    protected String dateOpenedOrDisbursed;
    protected String dateOfLastPayment;
    protected String dateClosed;
    protected String dateReportedAndCertified;
    protected Double highCreditOrSanctionedAmount;
    protected Double currentBalance;
    protected Double overdueAmount;
    protected String paymentHistory1;
    protected String paymentHistory2;
    protected String paymentHistoryStartDate;
    protected String paymentHistoryEndDate;
    protected String suitFiledOrWilfulDefault;
    protected String writtenOffAndSettledStatus;
    protected Double valueOfCollateral;
    protected String typeOfCollateral;
    protected Double creditLimit;
    protected Double cashLimit;
    protected Float rateOfInterest;
    protected Short repaymentTenure;
    protected Integer emiAmount;
    protected Double writtenOffAmountTotal;
    protected Double writtenOffAmountPrincipal;
    protected Double settlementAmount;
    protected String paymentFrequence;
    protected Double actualPaymentAmount;
    protected String dateOfEntryForErrorCode;
    protected String errorCode;
    protected String dateOfEntryForCibilRemarksCode;
    protected String cibilRemarkCode;
    protected String dateOfEntryForErrorOrDisputeRemarksCode;
    protected String errorOrDisputeRemarksCode1;
    protected String errorOrDisputeRemarksCode2;
    protected String instituteName;
    protected Double disbursedAmount;
    protected Double highCredit;
    protected Double sanctionAmount;
    protected Double lastPaymentAmount;
    protected String closureReason;
    protected String daysPastDue;
    protected String assetClassification;
    protected String accountStatus;
    protected String disputeCode;
    protected String paymentRating;
    @XmlElement(required = true)
    protected String accountTypeCode;
    @XmlElement(required = true)
    protected String accountRelationCode;
    @XmlElement(required = true)
    protected String accountRelation;
    @XmlElement(required = true)
    protected String swwStatusCode;
    @XmlElement(required = true)
    protected String swwStatus;
    @XmlElement(required = true)
    protected String swwStatusAmount;

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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the ownershipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipIndicator() {
        return ownershipIndicator;
    }

    /**
     * Sets the value of the ownershipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipIndicator(String value) {
        this.ownershipIndicator = value;
    }

    /**
     * Gets the value of the dateOpenedOrDisbursed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOpenedOrDisbursed() {
        return dateOpenedOrDisbursed;
    }

    /**
     * Sets the value of the dateOpenedOrDisbursed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOpenedOrDisbursed(String value) {
        this.dateOpenedOrDisbursed = value;
    }

    /**
     * Gets the value of the dateOfLastPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfLastPayment() {
        return dateOfLastPayment;
    }

    /**
     * Sets the value of the dateOfLastPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfLastPayment(String value) {
        this.dateOfLastPayment = value;
    }

    /**
     * Gets the value of the dateClosed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateClosed() {
        return dateClosed;
    }

    /**
     * Sets the value of the dateClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateClosed(String value) {
        this.dateClosed = value;
    }

    /**
     * Gets the value of the dateReportedAndCertified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReportedAndCertified() {
        return dateReportedAndCertified;
    }

    /**
     * Sets the value of the dateReportedAndCertified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReportedAndCertified(String value) {
        this.dateReportedAndCertified = value;
    }

    /**
     * Gets the value of the highCreditOrSanctionedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHighCreditOrSanctionedAmount() {
        return highCreditOrSanctionedAmount;
    }

    /**
     * Sets the value of the highCreditOrSanctionedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHighCreditOrSanctionedAmount(Double value) {
        this.highCreditOrSanctionedAmount = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentBalance(Double value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the overdueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverdueAmount() {
        return overdueAmount;
    }

    /**
     * Sets the value of the overdueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverdueAmount(Double value) {
        this.overdueAmount = value;
    }

    /**
     * Gets the value of the paymentHistory1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentHistory1() {
        return paymentHistory1;
    }

    /**
     * Sets the value of the paymentHistory1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentHistory1(String value) {
        this.paymentHistory1 = value;
    }

    /**
     * Gets the value of the paymentHistory2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentHistory2() {
        return paymentHistory2;
    }

    /**
     * Sets the value of the paymentHistory2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentHistory2(String value) {
        this.paymentHistory2 = value;
    }

    /**
     * Gets the value of the paymentHistoryStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentHistoryStartDate() {
        return paymentHistoryStartDate;
    }

    /**
     * Sets the value of the paymentHistoryStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentHistoryStartDate(String value) {
        this.paymentHistoryStartDate = value;
    }

    /**
     * Gets the value of the paymentHistoryEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentHistoryEndDate() {
        return paymentHistoryEndDate;
    }

    /**
     * Sets the value of the paymentHistoryEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentHistoryEndDate(String value) {
        this.paymentHistoryEndDate = value;
    }

    /**
     * Gets the value of the suitFiledOrWilfulDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuitFiledOrWilfulDefault() {
        return suitFiledOrWilfulDefault;
    }

    /**
     * Sets the value of the suitFiledOrWilfulDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuitFiledOrWilfulDefault(String value) {
        this.suitFiledOrWilfulDefault = value;
    }

    /**
     * Gets the value of the writtenOffAndSettledStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrittenOffAndSettledStatus() {
        return writtenOffAndSettledStatus;
    }

    /**
     * Sets the value of the writtenOffAndSettledStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrittenOffAndSettledStatus(String value) {
        this.writtenOffAndSettledStatus = value;
    }

    /**
     * Gets the value of the valueOfCollateral property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValueOfCollateral() {
        return valueOfCollateral;
    }

    /**
     * Sets the value of the valueOfCollateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueOfCollateral(Double value) {
        this.valueOfCollateral = value;
    }

    /**
     * Gets the value of the typeOfCollateral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfCollateral() {
        return typeOfCollateral;
    }

    /**
     * Sets the value of the typeOfCollateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfCollateral(String value) {
        this.typeOfCollateral = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCreditLimit(Double value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the cashLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCashLimit() {
        return cashLimit;
    }

    /**
     * Sets the value of the cashLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCashLimit(Double value) {
        this.cashLimit = value;
    }

    /**
     * Gets the value of the rateOfInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRateOfInterest() {
        return rateOfInterest;
    }

    /**
     * Sets the value of the rateOfInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRateOfInterest(Float value) {
        this.rateOfInterest = value;
    }

    /**
     * Gets the value of the repaymentTenure property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRepaymentTenure() {
        return repaymentTenure;
    }

    /**
     * Sets the value of the repaymentTenure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRepaymentTenure(Short value) {
        this.repaymentTenure = value;
    }

    /**
     * Gets the value of the emiAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmiAmount() {
        return emiAmount;
    }

    /**
     * Sets the value of the emiAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmiAmount(Integer value) {
        this.emiAmount = value;
    }

    /**
     * Gets the value of the writtenOffAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWrittenOffAmountTotal() {
        return writtenOffAmountTotal;
    }

    /**
     * Sets the value of the writtenOffAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWrittenOffAmountTotal(Double value) {
        this.writtenOffAmountTotal = value;
    }

    /**
     * Gets the value of the writtenOffAmountPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWrittenOffAmountPrincipal() {
        return writtenOffAmountPrincipal;
    }

    /**
     * Sets the value of the writtenOffAmountPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWrittenOffAmountPrincipal(Double value) {
        this.writtenOffAmountPrincipal = value;
    }

    /**
     * Gets the value of the settlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSettlementAmount(Double value) {
        this.settlementAmount = value;
    }

    /**
     * Gets the value of the paymentFrequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFrequence() {
        return paymentFrequence;
    }

    /**
     * Sets the value of the paymentFrequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFrequence(String value) {
        this.paymentFrequence = value;
    }

    /**
     * Gets the value of the actualPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualPaymentAmount() {
        return actualPaymentAmount;
    }

    /**
     * Sets the value of the actualPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualPaymentAmount(Double value) {
        this.actualPaymentAmount = value;
    }

    /**
     * Gets the value of the dateOfEntryForErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfEntryForErrorCode() {
        return dateOfEntryForErrorCode;
    }

    /**
     * Sets the value of the dateOfEntryForErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfEntryForErrorCode(String value) {
        this.dateOfEntryForErrorCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the dateOfEntryForCibilRemarksCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfEntryForCibilRemarksCode() {
        return dateOfEntryForCibilRemarksCode;
    }

    /**
     * Sets the value of the dateOfEntryForCibilRemarksCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfEntryForCibilRemarksCode(String value) {
        this.dateOfEntryForCibilRemarksCode = value;
    }

    /**
     * Gets the value of the cibilRemarkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCibilRemarkCode() {
        return cibilRemarkCode;
    }

    /**
     * Sets the value of the cibilRemarkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCibilRemarkCode(String value) {
        this.cibilRemarkCode = value;
    }

    /**
     * Gets the value of the dateOfEntryForErrorOrDisputeRemarksCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfEntryForErrorOrDisputeRemarksCode() {
        return dateOfEntryForErrorOrDisputeRemarksCode;
    }

    /**
     * Sets the value of the dateOfEntryForErrorOrDisputeRemarksCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfEntryForErrorOrDisputeRemarksCode(String value) {
        this.dateOfEntryForErrorOrDisputeRemarksCode = value;
    }

    /**
     * Gets the value of the errorOrDisputeRemarksCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorOrDisputeRemarksCode1() {
        return errorOrDisputeRemarksCode1;
    }

    /**
     * Sets the value of the errorOrDisputeRemarksCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorOrDisputeRemarksCode1(String value) {
        this.errorOrDisputeRemarksCode1 = value;
    }

    /**
     * Gets the value of the errorOrDisputeRemarksCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorOrDisputeRemarksCode2() {
        return errorOrDisputeRemarksCode2;
    }

    /**
     * Sets the value of the errorOrDisputeRemarksCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorOrDisputeRemarksCode2(String value) {
        this.errorOrDisputeRemarksCode2 = value;
    }

    /**
     * Gets the value of the instituteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstituteName() {
        return instituteName;
    }

    /**
     * Sets the value of the instituteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstituteName(String value) {
        this.instituteName = value;
    }

    /**
     * Gets the value of the disbursedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDisbursedAmount() {
        return disbursedAmount;
    }

    /**
     * Sets the value of the disbursedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDisbursedAmount(Double value) {
        this.disbursedAmount = value;
    }

    /**
     * Gets the value of the highCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHighCredit() {
        return highCredit;
    }

    /**
     * Sets the value of the highCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHighCredit(Double value) {
        this.highCredit = value;
    }

    /**
     * Gets the value of the sanctionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSanctionAmount() {
        return sanctionAmount;
    }

    /**
     * Sets the value of the sanctionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSanctionAmount(Double value) {
        this.sanctionAmount = value;
    }

    /**
     * Gets the value of the lastPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    /**
     * Sets the value of the lastPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLastPaymentAmount(Double value) {
        this.lastPaymentAmount = value;
    }

    /**
     * Gets the value of the closureReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureReason() {
        return closureReason;
    }

    /**
     * Sets the value of the closureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureReason(String value) {
        this.closureReason = value;
    }

    /**
     * Gets the value of the daysPastDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysPastDue() {
        return daysPastDue;
    }

    /**
     * Sets the value of the daysPastDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysPastDue(String value) {
        this.daysPastDue = value;
    }

    /**
     * Gets the value of the assetClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetClassification() {
        return assetClassification;
    }

    /**
     * Sets the value of the assetClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetClassification(String value) {
        this.assetClassification = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the disputeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeCode() {
        return disputeCode;
    }

    /**
     * Sets the value of the disputeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeCode(String value) {
        this.disputeCode = value;
    }

    /**
     * Gets the value of the paymentRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRating() {
        return paymentRating;
    }

    /**
     * Sets the value of the paymentRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRating(String value) {
        this.paymentRating = value;
    }

    /**
     * Gets the value of the accountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Sets the value of the accountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeCode(String value) {
        this.accountTypeCode = value;
    }

    /**
     * Gets the value of the accountRelationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountRelationCode() {
        return accountRelationCode;
    }

    /**
     * Sets the value of the accountRelationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountRelationCode(String value) {
        this.accountRelationCode = value;
    }

    /**
     * Gets the value of the accountRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountRelation() {
        return accountRelation;
    }

    /**
     * Sets the value of the accountRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountRelation(String value) {
        this.accountRelation = value;
    }

    /**
     * Gets the value of the swwStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwwStatusCode() {
        return swwStatusCode;
    }

    /**
     * Sets the value of the swwStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwwStatusCode(String value) {
        this.swwStatusCode = value;
    }

    /**
     * Gets the value of the swwStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwwStatus() {
        return swwStatus;
    }

    /**
     * Sets the value of the swwStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwwStatus(String value) {
        this.swwStatus = value;
    }

    /**
     * Gets the value of the swwStatusAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwwStatusAmount() {
        return swwStatusAmount;
    }

    /**
     * Sets the value of the swwStatusAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwwStatusAmount(String value) {
        this.swwStatusAmount = value;
    }

}
