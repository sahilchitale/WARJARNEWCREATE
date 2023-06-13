package com.fico.kmbl.clos.realtime.logging;

import java.sql.Timestamp;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fico.kmbl.clos.realtime.model.BlazeReqLogging;
import com.fico.kmbl.clos.realtime.model.BlazeResLogging;
import com.fico.kmbl.clos.realtime.service.BlazeRequestLoggingService;
import com.fico.kmbl.clos.realtime.service.BlazeResponseLoggingService;
import com.fico.kmbl.clos.realtime.utils.PrettyPrintUtil;
import com.fico.kmbl.instabl.blaze.model.Message;

@Component
public class PayloadLogging {

	Logger logger = LoggerFactory.getLogger(PayloadLogging.class);
	
	@Autowired
	private BlazeRequestLoggingService blazeRequestLoggingService;
	
	@Autowired
	private BlazeResponseLoggingService blazeResponseLoggingService;
	
	
	public void insertPayLoad(Message request, String type) {
		
	    String applicationId = request.getInvocation().getApplicationNumber();
	    //Timestamp currentTimestamp = new Timestamp(new Date(0).getTime());
	    String transactionId = UUID.randomUUID().toString();
	    String sourceAppCode = request.getInvocation().getSourceAppCode();
	    String requestedCall = request.getInvocation().getRequestedCall();
	    //String portfolioName = request.getInvocation().getgetPortfolioName();
	    //String businessUnitType = request.getInvocation().getBusinessSubUnit();
	    String xml = null;
	    
	    if(type.equals("Request")) {
	    	
	    	xml = PrettyPrintUtil.convertJavaToXml(request);
	    	
	    	BlazeReqLogging blazeReqLogging = new BlazeReqLogging();
	    	blazeReqLogging.setTransactionId(transactionId);
	    	blazeReqLogging.setSrcApplId(applicationId);
	    	blazeReqLogging.setSourceAppCode(sourceAppCode);
	    	blazeReqLogging.setRequestedCall(requestedCall);
////	    	blazeReqLogging.setPortfolioName(portfolioName);
////	    	blazeReqLogging.setBusinessUnitType(businessUnitType);
	    	blazeReqLogging.setRequestXml(xml);	
	    	blazeReqLogging.setAsOnDateTime(new Timestamp(System.currentTimeMillis()));
//	    	
	    	blazeRequestLoggingService.createBlazeReqLogging(blazeReqLogging);
	    }
	    if(type.equals("Response")) {
	    	
	    	//Message response  = new Message();
	    	//response.setResponse(request.getResponse());
	    	//response.setResponse(request.getResponse());
	    	
	    	xml = PrettyPrintUtil.convertJavaToXml(request);
	    	
	    	BlazeResLogging blazeResLogging = new BlazeResLogging();
	    	blazeResLogging.setTransactionId(transactionId);
	    	blazeResLogging.setSrcApplId(applicationId);
	    	blazeResLogging.setSourceAppCode(sourceAppCode);
	    	blazeResLogging.setRequestedCall(requestedCall);
////	    	blazeResLogging.setDecisionPoint(decisionPoint);
////	    	blazeResLogging.setPortfolioName(portfolioName);
////	    	blazeResLogging.setBusinessUnitType(businessUnitType);
////	    	blazeResLogging.setTotalTimeTaken(request.getInvocation().getTotalTimeTaken());
////	    	blazeResLogging.setResponseStatus(request.getInvocation().getResponseStatus());
	    	blazeResLogging.setResponseXml(xml);
	    	blazeResLogging.setAsOnDateTime(new Timestamp(System.currentTimeMillis()));
	    	
	    	
	    	blazeResponseLoggingService.createBlazeReqLogging(blazeResLogging);
	    }
	}
}
