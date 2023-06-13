package com.fico.kmbl.clos.realtime.model;

import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.blazesoft.server.base.NdServerException;
import com.blazesoft.server.deploy.NdStatelessServer;
import com.blazesoft.server.deploy.manager.NdDeploymentManager;
import com.blazesoft.server.deploy.manager.NdDeploymentManagerEvent;
import com.blazesoft.server.deploy.manager.NdDeploymentManagerException;
import com.blazesoft.server.deploy.manager.NdDeploymentManagerListener;
import com.blazesoft.server.local.NdLocalServerException;


@Component
public class DecisionServiceFactory {

	/** The Constant logger. */
	static final Logger logger = LoggerFactory.getLogger(DecisionServiceFactory.class);

	/** The decision service name map. */
	private DecisionService decisionService;

	@Value("${blaze.server.file}")
	private String ruleServerConfigFile;

	@Value("${blaze.server.name}")
	private String ruleServiceName;

	@Value("${blaze.health.check.entryPoint}")
	private String healthCheckEntryPoint;

	@Value("${blaze.decision.entryPoint}")
	private String entryPoint;

	@Value("${blaze.deployment.artifacts.file.path}")
	private String deploymentFilePath;

	private NdDeploymentManager deploymentManger;


	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		BlazeServer blazeServer = null;
		//NdStatelessServer ndStatelessServer = null;
		try {

			blazeServer = (BlazeServer) BlazeServer.createStatelessServer(deploymentFilePath + ruleServerConfigFile);

			logger.info("Secured Loan RealTime: Initialized the Blaze Rule Server");

		} catch (NdLocalServerException e) {
			String uuid = UUID.randomUUID().toString();
			logger.error(String.format("Secured Loan RealTime: Unable to initilize Blaze Server for %s, %s. for id ..",
					new Object[] { deploymentFilePath + ruleServerConfigFile, ruleServiceName, uuid }));
			logger.error("Secured Loan RealTime: Exception Detail - ", e);
			throw new RuntimeException(String.format("Secured Loan Realtime: Blaze technical excepiton id: {}", uuid));
		}

		decisionService = new DecisionService(blazeServer, ruleServiceName, entryPoint,
				entryPoint);
	}

	/**
	 * Destroy.
	 */
	@PreDestroy
	public void destroy() {
		if (decisionService != null && decisionService.getBlazeServer() != null) {
			try {
				decisionService.getBlazeServer().shutdown();
			} catch (NdServerException e) {
				logger.error(String.format("Secured Loan RealTime: Exception during shutdown of BlazeServer with %s",
						decisionService.getBlazeServer().getServerId().getConfigurationName()), e);
			}
		}
		try {
			deploymentManger.shutdown();
		} catch (NdDeploymentManagerException e) {
			logger.error(String.format("Secured Loan RealTime: Exception during shutdown of Deployment Manager with %s",
					deploymentManger.getConfig().getName()), e);
		}
	}

	public DecisionService getDecisionService() {
		return decisionService;
	}

	public void setCCDecisionService(DecisionService decisionService) {
		this.decisionService = decisionService;
	}

}
