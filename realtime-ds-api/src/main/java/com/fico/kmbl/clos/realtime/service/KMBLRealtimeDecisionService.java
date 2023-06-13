package com.fico.kmbl.clos.realtime.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fico.kmbl.clos.realtime.model.DecisionServiceFactory;
import com.fico.kmbl.instabl.blaze.model.Invocation;
import com.fico.kmbl.instabl.blaze.model.Message;

@Component
public class KMBLRealtimeDecisionService {

	@Autowired
	private DecisionServiceFactory decisionService;

	Logger logger = LoggerFactory.getLogger("KMBLRealtimeDecisionService.class");

	public Message getDecision(Message request) {
		Message response;
		logger.info("Secured Loan RealTime: KMBL Secured blaze decison service invocation started");
		response = decisionService.getDecisionService().invokeDeicison(request);
		logger.info("Secured Loan RealTime: Blaze decison service invocation end");

		return response;
	}

	public Invocation checkAPIHealth() {
		Invocation invocationResponse;
		logger.info("Secured Loan RealTime: healthcheck blaze decison service invocation started");
		invocationResponse = decisionService.getDecisionService().healthCheck();
		logger.info("Secured Loan RealTime: healthcheck blaze decison service invocation end");
		return invocationResponse;
	}

}
