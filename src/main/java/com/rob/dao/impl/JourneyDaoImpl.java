package com.rob.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.rob.dao.IJourneyDao;
import com.rob.modal.Journey;

@Repository
public class JourneyDaoImpl implements IJourneyDao{

	Logger logger = LoggerFactory.getLogger(JourneyDaoImpl.class);
		
	public Journey create(Journey journey) {
		logger.info("Journey create dao...");
		// TODO Auto-generated method stub
		// db.save(journey); //db connection code
		return journey;
	}

}
