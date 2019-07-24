package com.rob.rest.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rob.modal.Customer;
import com.rob.rest.ICustomerRest;
import com.rob.service.ICustomerService;
import com.rob.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/Customer")
public class CustomerRestImpl implements ICustomerRest{
	
	Logger logger = LoggerFactory.getLogger(CustomerRestImpl.class);

	@Autowired
	private ICustomerService service;
	
	@PostMapping(path = "/createCustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	@ResponseBody
	public Customer createCustomer(@RequestBody Customer customer) {
		logger.info("Customer create service...");
		return service.create(customer);
	}

	@GetMapping("/findByPk")
	public Customer findByPk(@RequestParam(name="pk") Integer pk) {
		return new Customer(pk);
	}
	
}
