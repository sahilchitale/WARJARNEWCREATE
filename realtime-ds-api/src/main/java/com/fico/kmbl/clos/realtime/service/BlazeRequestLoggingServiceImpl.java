package com.fico.kmbl.clos.realtime.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fico.kmbl.clos.realtime.dao.BlazeReqeustLoggingCrudRepository;
import com.fico.kmbl.clos.realtime.model.BlazeReqLogging;


@Service
public class BlazeRequestLoggingServiceImpl implements BlazeRequestLoggingService{

	
	@Autowired
	private BlazeReqeustLoggingCrudRepository blazeReqeustLoggingCrudRepository;
	
	@Override
	@Transactional
	public BlazeReqLogging createBlazeReqLogging(BlazeReqLogging blazeReqLogging) {
		// TODO Auto-generated method stub
		return blazeReqeustLoggingCrudRepository.save(blazeReqLogging);
	}

}
