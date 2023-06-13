package com.fico.kmbl.clos.realtime.model;

import com.blazesoft.server.base.NdServerException;
import com.blazesoft.server.base.NdServiceException;
import com.blazesoft.server.base.NdServiceSessionException;
import com.blazesoft.server.config.NdServerConfig;
import com.blazesoft.server.deploy.NdStatelessServer;
import com.blazesoft.server.local.NdLocalServerException;
import com.fico.kmbl.instabl.blaze.model.Invocation;

/**
 * The Class BlazeServer.
 */
public class BlazeServer extends NdStatelessServer {
	
	/**
	 * Instantiates a new blaze server.
	 *
	 * @param ndServerConfig the nd server config
	 * @throws NdLocalServerException the nd local server exception
	 */
	public BlazeServer(NdServerConfig ndServerConfig) throws NdLocalServerException {
		super(ndServerConfig);
	}
	
	/**
	 * Invoke.
	 *
	 * @param ruleServiceName the rule service name
	 * @param methodName the method name
	 * @param request the request
	 * @return the object
	 * @throws NdServiceSessionException the nd service session exception
	 * @throws NdLocalServerException the nd local server exception
	 * @throws NdServiceException the nd service exception
	 */
	public Object invoke(String ruleServiceName, String methodName, Object request) throws NdServiceSessionException, NdLocalServerException, NdServiceException {
		return invokeService(ruleServiceName, methodName, null, new Object[] { request });
	}
	
	/**
	 *	Invokes a server through the entry point "EP_HealthCheckDS"
	 *	in the service "DS_PEPPricingService".
	 *
	 *	
	 *	@return	com.fico.westpac.blaze.model.InvocationResponse	==> Enter a description of the return value
	 */
	public Invocation eP_HealthCheckDS(String ruleServiceName, String methodName) throws NdServerException, NdServiceException, NdServiceSessionException
	{
		// Build the argument list
		Object[] applicationArgs = new Object[0];
		

		// Invoke the service and returns its result, if any.
		Invocation retVal = (Invocation)invokeService(ruleServiceName, methodName, null, applicationArgs);
		return retVal;
	}
}
