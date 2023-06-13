package com.fico.kmbl.clos.realtime.utils;

import java.io.StringWriter;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fico.kmbl.instabl.blaze.model.Message;

/**
 * The Class PrettyPrintUtil.
 */
public class PrettyPrintUtil {

	/** The om. */
	
	
	private static ObjectMapper om = new ObjectMapper();

	private static JAXBContext jaxbContextRequest;
	
	private static JAXBContext jaxbContextResponse;

	/**
	 * Object to string.
	 *
	 * @param scoreRequest the score request
	 * @return the string
	 */
	public static String ObjectToString(Object scoreRequest) {

		String value = null;

		try {
			value = om.writeValueAsString(scoreRequest);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static String convertJavaToXml(Message request) {
		final StringWriter stringWriter = new StringWriter();
		String blazeRequestString = null;
		try {
			if (jaxbContextRequest == null) {
				jaxbContextRequest = JAXBContext.newInstance(Message.class);
			}
			Marshaller marshaller = jaxbContextRequest.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
			marshaller.marshal(request, stringWriter);
			blazeRequestString = stringWriter.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return blazeRequestString;
	}
	
	

}
