package com.rob.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rob.app.AppConstants;
import com.rob.app.enums.CustomerType;
import com.rob.dao.IJourneyDao;
import com.rob.dao.IJourneyPriceDao;
import com.rob.modal.Journey;
import com.rob.modal.JourneyPrice;
import com.rob.service.IJourneyService;

@Service
public class JourneyServiceImpl implements IJourneyService{

	Logger logger = LoggerFactory.getLogger(JourneyServiceImpl.class);
	
	@Autowired
	private IJourneyDao dao;
	
	@Autowired
	private IJourneyPriceDao journeyPriceDao;
	
	public Journey create(Journey journey) {
		logger.info("Journey create service...");
		return dao.create(journey);
	}
	
	/*Input data validations and null checks need to apply*/
	public Journey addJourney(Journey journey) {
		logger.info("add Journey create service...");
		Journey dbJourney = create(journey);
		
		JourneyPrice price=new JourneyPrice();
		price.setJourney(dbJourney);
		
		if(CustomerType.VIP.equals(journey.getCustomer().getCustomerType())){ 
			price.setPrice(AppConstants.JOURNEY_PRICE_FOR_VIP_CUSTOMER);
		}else{
			price.setPrice(AppConstants.JOURNEY_PRICE_FOR_NON_VIP_CUSTOMER);
		}
		
		if(journey.getRouteName().equals(journey.getCustomer().getFavouriteRoute())){
			price.setDiscount(AppConstants.FAVORITE_ROUTE_DISCOUNT);
		}

		if(isTakenSameJourneyMoreThanTwice(dbJourney)){
			price.setDiscount(price.getDiscount()+AppConstants.ADDITIONAL_DISCOUNT);
		}
		
		price.setNetPrice(price.getPrice()-price.getPrice()*price.getDiscount()*AppConstants.PERCENTAGE_MULTIPLIER);
		journeyPriceDao.create(price);
		
		return dbJourney;
	}
	
	/*Check wheather the customer has taken the same journey route more than
	twice in the past 48 hours or not*/
	public Boolean isTakenSameJourneyMoreThanTwice(Journey journey){
		//write code to get data from table to check the required information
		return null;
	}

}
