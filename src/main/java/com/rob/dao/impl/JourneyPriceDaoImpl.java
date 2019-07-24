package com.rob.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.rob.dao.IJourneyPriceDao;
import com.rob.modal.JourneyPrice;

@Repository
public class JourneyPriceDaoImpl implements IJourneyPriceDao {
	
	Logger logger = LoggerFactory.getLogger(JourneyPriceDaoImpl.class);
	
	public JourneyPrice create(JourneyPrice price) {
		logger.info("JourneyPrice create dao...");
		// TODO Auto-generated method stub
		// db.save(journeyPrice); //db connection code
		return price;
	}

}
