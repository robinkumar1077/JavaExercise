package com.rob.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.rob.dao.ICustomerDao;
import com.rob.modal.Customer;
import com.rob.service.impl.JourneyServiceImpl;

@Repository
public class CustomerDaoImpl implements ICustomerDao{

	Logger logger = LoggerFactory.getLogger(CustomerDaoImpl.class);
		
	public Customer create(Customer customer) {
		logger.info("Customer create dao...");
		// TODO Auto-generated method stub
		// db.save(customer); //db connection code
		return customer;
	}

}
