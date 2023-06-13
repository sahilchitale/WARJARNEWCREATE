package com.fico.kmbl.clos.realtime.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fico.kmbl.clos.realtime.model.BlazeResLogging;



@Repository
public interface BlazeResponseLoggingCrudRepository extends CrudRepository<BlazeResLogging, Long>{

}
