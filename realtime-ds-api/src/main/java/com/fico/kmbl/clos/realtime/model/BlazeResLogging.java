package com.fico.kmbl.clos.realtime.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;



  /*The persistent class for the BLAZE_RES_LOGGING database table.
   * 
   * 
   * */
@Entity
@Table(name="BLAZE_RES_LOGGING")
@NamedQuery(name="BlazeResLogging.findAll", query="SELECT b FROM BlazeResLogging b")
public class BlazeResLogging implements Serializable {
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

	@Column(name="REQUESTED_CALL")
	private String requestedCall;
	
	@Column(name="AS_ON_DATE_TIME")
	private Timestamp asOnDateTime;



	/*@Column(name="DECISION_SERVICE")
	private String decisionService;*/

	@Lob
	@Column(name="RESPONSE_XML")
	private String responseXml;

	
	public BlazeResLogging() {
	}
	

//	public String getBusinessUnitType() {
//		return businessUnitType;
//	}
//
//
//	public void setBusinessUnitType(String businessUnitType) {
//		this.businessUnitType = businessUnitType;
//	}
//
//
//	public String getPortfolioName() {
//		return portfolioName;
//	}
//
//	public void setPortfolioName(String portfolioName) {
//		this.portfolioName = portfolioName;
//	}
	
	public String getTransactionId() {
		return this.transactionId;
	}

	public String getRequestedCall() {
		return requestedCall;
	}


	public void setRequestedCall(String requestedCall) {
		this.requestedCall = requestedCall;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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

	/*public String getDecisionService() {
		return this.decisionService;
	}

	public void setDecisionService(String decisionService) {
		this.decisionService = decisionService;
	}*/

	public String getResponseXml() {
		return this.responseXml;
	}

	public void setResponseXml(String responseXml) {
		this.responseXml = responseXml;
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

//	public String getResponseStatus() {
//		return responseStatus;
//	}
//
//	public void setResponseStatus(String responseStatus) {
//		this.responseStatus = responseStatus;
//	}
//
//	public String getTotalTimeTaken() {
//		return totalTimeTaken;
//	}
//
//	public void setTotalTimeTaken(String totalTimeTaken) {
//		this.totalTimeTaken = totalTimeTaken;
//	}

}