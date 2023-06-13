package com.fico.kmbl.clos.realtime.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fico.kmbl.clos.realtime.logging.PayloadLogging;
import com.fico.kmbl.clos.realtime.service.KMBLRealtimeDecisionService;
import com.fico.kmbl.clos.realtime.utils.PrettyPrintUtil;
//import com.fico.kmbl.corporateLoan.blaze.model.Invocation;
//import com.fico.kmbl.corporateLoan.blaze.model.Message;

import com.fico.kmbl.instabl.blaze.model.Invocation;
import com.fico.kmbl.instabl.blaze.model.Message;

@RestController
@RequestMapping("/instabl-loan-api")

public class KMBLSecuredLoanHandler {

	Logger logger = LoggerFactory.getLogger(KMBLSecuredLoanHandler.class);

	@Autowired
	private KMBLRealtimeDecisionService kmblRealtimeDecisionService;

	@Autowired
	private PayloadLogging payloadLogging;
	
	@RequestMapping(value = "/decision", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Message> getSecuredLoanDecision(@RequestBody(required = true) Message request) {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug(String.format("Secured Loan RealTime: Decision Request : %s",
					new Object[] { PrettyPrintUtil.ObjectToString(request) }));
		}
		// logging the request into file location
		payloadLogging.insertPayLoad(request, "Request");

		Message resposne = this.kmblRealtimeDecisionService.getDecision(request);
		logger.info("Return from KMBL realtime Decision Service");
		// logging the request into file location
		payloadLogging.insertPayLoad(resposne, "Response");

		if (this.logger.isDebugEnabled()) {
			logger.info("After logger is debug enabled");
			this.logger.debug(String.format("KMBL Secured Loan RealTime: Decision Response : %s",
					new Object[] { PrettyPrintUtil.ObjectToString(resposne) }));
			logger.info("After logger is debug enabled End");
		}
		ResponseEntity<Message> responseEntity = new ResponseEntity<Message>(resposne, HttpStatus.OK);
		logger.info("Response entity end");
		return responseEntity;
	}

	@RequestMapping(value = "/health", method = RequestMethod.POST, produces = { MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<String> checkSecuredLoanAPIHealth() {

		Invocation invocationResponse = this.kmblRealtimeDecisionService.checkAPIHealth();
		if (this.logger.isDebugEnabled()) {
			this.logger.debug(String.format("KMBL Secured Loan RealTime: Healthcheck Response : %s",
					new Object[] { PrettyPrintUtil.ObjectToString(invocationResponse) }));
		}
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(
				invocationResponse.getResponseStatus().toString(), HttpStatus.OK);
		return responseEntity;
	}

}
