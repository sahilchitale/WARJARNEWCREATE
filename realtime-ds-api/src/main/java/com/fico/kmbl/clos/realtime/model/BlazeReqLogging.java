package com.fico.kmbl.clos.realtime.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BLAZE_REQ_LOGGING database table.
 * 
 */
@Entity
@Table(name="BLAZE_REQ_LOGGING")
@NamedQuery(name="BlazeReqLogging.findAll", query="SELECT b FROM BlazeReqLogging b")
public class BlazeReqLogging implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="SRC_APPL_ID")
	private String srcApplId;
	
	@Column(name="SOURCE_APP_CODE")
	private String sourceAppCode;
	
//	@Column(name="DECISION_POINT")
//	private String decisionPoint;
//	
//	@Column(name="PORTFOLIO_NAME")
//	private String portfolioName;
//	
//	@Column(name="BUSINESS_UNIT_TYPE")
//	private String businessUnitType;

	@Column(name="REQUESTED_CALL")
	private String requestedCall;
	
	
	@Column(name="AS_ON_DATE_TIME")
	private Timestamp asOnDateTime;



	/*@Column(name="DECISON_SERVICE")
	private String decisonService;*/

	
	@Lob
	@Column(name="REQUEST_XML")
	private String requestXml;

	
//	public String getPortfolioName() {
//		return portfolioName;
//	}
//
//	public void setPortfolioName(String portfolioName) {
//		this.portfolioName = portfolioName;
//	}
//
//	public String getBusinessUnitType() {
//		return businessUnitType;
//	}
//
//	public void setBusinessUnitType(String businessUnitType) {
//		this.businessUnitType = businessUnitType;
//	}


	public BlazeReqLogging() {
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public String getRequestedCall() {
		return requestedCall;
	}

	public void setRequestedCall(String requestedCall) {
		this.requestedCall = requestedCall;
	}

	
	
	public Timestamp getAsOnDateTime() {
		return this.asOnDateTime;
	}

	public void setAsOnDateTime(Timestamp asOnDateTime) {
		this.asOnDateTime = asOnDateTime;
	}

//	public String getDecisionPoint() {
//		return this.decisionPoint;
//	}
//
//	public void setDecisionPoint(String decisionPoint) {
//		this.decisionPoint = decisionPoint;
//	}

	/*public String getDecisonService() {
		return this.decisonService;
	}

	public void setDecisonService(String decisonService) {
		this.decisonService = decisonService;
	}*/

	public String getRequestXml() {
		return this.requestXml;
	}

	public void setRequestXml(String requestXml) {
		this.requestXml = requestXml;
	}

	public String getSourceAppCode() {
		return this.sourceAppCode;
	}

	public void setSourceAppCode(String sourceAppCode) {
		this.sourceAppCode = sourceAppCode;
	}

	public String getSrcApplId() {
		return this.srcApplId;
	}

	public void setSrcApplId(String srcApplId) {
		this.srcApplId = srcApplId;
	}

}