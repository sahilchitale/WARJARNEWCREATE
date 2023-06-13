package com.fico.kmbl.clos.realtime.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fico.kmbl.clos.realtime.model.BlazeReqLogging;



@Repository
public interface BlazeReqeustLoggingCrudRepository extends CrudRepository<BlazeReqLogging, Long>{

}
