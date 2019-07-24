package com.rob.rest.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.rob.rest.IGenericCxfRest;

@Service
@Repository
@Component
@Controller
@Path("GenericCxf") 
//We can use this Apache Cxf rest as well instead of Spring Rest
public class GenericCxfRestImpl implements IGenericCxfRest{
	
	Logger logger = LoggerFactory.getLogger(GenericCxfRestImpl.class);
	
	@GET
	@Path("/test")
	public String testGet(){
		return "test get success...";
	}
}
