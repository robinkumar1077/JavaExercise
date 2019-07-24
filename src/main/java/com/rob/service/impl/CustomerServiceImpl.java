package com.rob.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rob.dao.ICustomerDao;
import com.rob.dao.impl.JourneyDaoImpl;
import com.rob.modal.Customer;
import com.rob.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{

	Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private ICustomerDao dao;

	public Customer create(Customer customer) {
		logger.info("Customer create service...");
		return dao.create(customer);
	}
	
	
}
