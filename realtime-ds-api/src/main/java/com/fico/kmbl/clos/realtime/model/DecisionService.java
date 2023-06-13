package com.fico.kmbl.clos.realtime.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.blazesoft.server.base.NdServerException;
import com.blazesoft.server.base.NdServiceException;
import com.blazesoft.server.base.NdServiceSessionException;
import com.blazesoft.server.local.NdLocalServerException;
import com.fico.kmbl.instabl.blaze.model.Invocation;
import com.fico.kmbl.instabl.blaze.model.Message;


public class DecisionService {

	/** The Constant logger. */
	static final Logger logger = LoggerFactory.getLogger(DecisionService.class);

	/** The blaze server. */
	private BlazeServer blazeServer;

	/** The rule service name. */
	private String ruleServiceName;

	/** The entry point name for Health Check. */
	private String healthCheckEntryPoint;

	/** The entry point name for pricing method name. */
	private String entryPoint;
	
	/** Server file location */
	//private String serverFileLocation;
	
	/** New addition hashmap. */
	
//	@SuppressWarnings("rawtypes") 
//	public static Map<String, Map> hashMap = new HashMap<String, Map>();
	 

	/**
	 * Instantiates a new decision service.
	 *
	 * @param blazeServer
	 *            the blaze server
	 * @param ruleServiceName
	 *            the rule service name
	 * @param healthCheckEntryPoint
	 *            the entry point name
	 * @param pricingEntryPoint
	 *            the entry point name
	 * @return
	 */
	public DecisionService(BlazeServer blazeServer, String ruleServiceName, String healthCheckEntryPoint,
			String entryPoint) {
		this.blazeServer = blazeServer;
		this.ruleServiceName = ruleServiceName;
		this.healthCheckEntryPoint = healthCheckEntryPoint;
		this.entryPoint = entryPoint;
	}

	/**
	 * Gets the blaze server.
	 *
	 * @return the blaze server
	 */
	public BlazeServer getBlazeServer() {
		return this.blazeServer;
	}

	
	public Message invokeDeicison(Message request) {
		Message response = null;

		try {
			//to fetch product new addition
			
//			  Map<String, String> mp = hashMap.get(request.getInvocation().getSourceAppCode()); 
//			  ruleServiceName =  mp.get("serviceName");
//			  entryPoint = mp.get("decisionPoint");
//			  serverFileLocation = mp.get("serverFile");
//			  blazeServer = (BlazeServer) BlazeServer.createStatelessServer(serverFileLocation);
				 
			Date jobStartTime = new Date();
			response = (Message) blazeServer.invoke(ruleServiceName, entryPoint, request);
			Date jobEndTime = new Date();
			logger.info("Secured Loan Realtime: Total Time Taken BLAZE CALL in------ milliseconds------"
					+ TimeUnit.MILLISECONDS.toMillis(jobEndTime.getTime() - jobStartTime.getTime()) + " milliSeconds ");
		} catch (NdLocalServerException e) {
			String uuid = UUID.randomUUID().toString();
			logger.error("Secured Loan RealTime:Exception during Blaze rule service invocation with id" + uuid, e);
			throw new RuntimeException(String.format("Secured Loan RealTime: Blaze technical excepiton id: {}", uuid));
		} catch (NdServiceSessionException e) {
			String uuid = UUID.randomUUID().toString();
			logger.error("Secured Loan RealTime:Exception during Blaze rule service invocation with id" + uuid, e);
			throw new RuntimeException(String.format("Secured Loan RealTime: Blaze technical excepiton id: {}", uuid));
		} catch (NdServiceException e) {
			String uuid = UUID.randomUUID().toString();
			logger.error("Secured Loan RealTime:Exception during Blaze rule service invocation with id" + uuid, e);
			throw new RuntimeException(String.format("Secured Loan RealTime: Blaze technical excepiton id: {}", uuid));
		}
		return response;
	}

	/**
	 * Invoke strategy.
	 *
	 * @param request
	 *            the request
	 * @return the score
	 */
	public Invocation healthCheck() {
		Invocation response = null;
		try {
			response = blazeServer.eP_HealthCheckDS(ruleServiceName, healthCheckEntryPoint);
		} catch (NdLocalServerException e) {
			String uuid = UUID.randomUUID().toString();
			logger.error("Secured Loan RealTime:Exception during Blaze rule service invocation with id" + uuid, e);
			throw new RuntimeException(String.format("Secured Loan RealTime: Blaze technical excepiton id: {}", uuid));
		} catch (NdServiceSessionException e) {
			String uuid = UUID.randomUUID().toString();
			logger.error("Secured Loan RealTime:Exception during Blaze rule service invocation with id" + uuid, e);
			throw new RuntimeException(String.format("Secured Loan RealTime: Blaze technical excepiton id: {}", uuid));
		} catch (NdServiceException e) {
			String uuid = UUID.randomUUID().toString();
			logger.error("Secured Loan RealTime:Exception during Blaze rule service invocation with id" + uuid, e);
			throw new RuntimeException(String.format("Secured Loan RealTime: Blaze technical excepiton id: {}", uuid));
		} catch (NdServerException e) {
			String uuid = UUID.randomUUID().toString();
			logger.error("Secured Loan RealTime:Exception during Blaze rule service invocation with id" + uuid, e);
			throw new RuntimeException(String.format("Secured Loan RealTime: Blaze technical excepiton id: {}", uuid));
		}
		return response;
	}
	
	//New addition
	
//	  public void createHashmaps() { //String propFileLoc =
//	  System.getenv("BL_BNPL_Configurations"); InputStream inputStream; Properties
//	  prop = new Properties();
//	  
//	  try {
//	  
//	  //File file = new File("D:\\Act21 Work\\lib\\application.properties"); 
//		  File file = new File("/app/FICO/Commercial_CLOS/deployment-artifacts/application.properties");
//	  
//	  inputStream = new FileInputStream(file);
//	  
//	  if (inputStream != null) { prop.load(inputStream); } int totalProd =
//	  Integer.parseInt(prop.getProperty("product.totalCount"));
//	  
//	  for (int i = 1; i <= totalProd; i++) { 
//		  String IdentityName =  prop.getProperty(i + ".identity"); 
//		  String ServerFileLocation = prop.getProperty(i + ".serverFile"); 
//		  String DecisionPointName = prop.getProperty(i + ".decisionPoint"); 
//		  String healthCheck = prop.getProperty(i + ".healthCheck"); 
//		  String serviceName = prop.getProperty(i + ".serviceName"); 
//		  Map<String, Object> mp = new HashMap<String, Object>();
//		  mp.put("identity", IdentityName); 
//		  mp.put("serverFile", ServerFileLocation);
//		  mp.put("decisionPoint", DecisionPointName); 
//		  mp.put("healthCheck",healthCheck); 
//		  mp.put("serviceName", serviceName);
//		  System.out.println(i+"-> IdentityName -> "+IdentityName);
//		  System.out.println(i+"-> ServerFileLocation -> "+ServerFileLocation);
//		  System.out.println(i+"-> DecisionPointName -> "+DecisionPointName);
//		  System.out.println(i+"-> healthCheck -> "+healthCheck);
//		  System.out.println(i+"-> serviceName -> "+serviceName);
//		  hashMap.put(IdentityName, mp); }
//	  
//	  } catch (Exception e) {
//	  
//	  }
//	  
//	  }
	 
}
