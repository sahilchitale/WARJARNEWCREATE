package com.fico.kmbl.clos.realtime.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fico.kmbl.clos.realtime.dao.BlazeResponseLoggingCrudRepository;
import com.fico.kmbl.clos.realtime.model.BlazeResLogging;



@Service
public class BlazeResponseLoggingServiceImpl implements BlazeResponseLoggingService{

	@Autowired
	private BlazeResponseLoggingCrudRepository blazeResponseLoggingCrudRepository;
	
	@Override
	@Transactional
	public BlazeResLogging createBlazeReqLogging(BlazeResLogging blazeResLogging) {
		// TODO Auto-generated method stub
		return blazeResponseLoggingCrudRepository.save(blazeResLogging);
	}

}
