package com.rob.rest.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rob.modal.Journey;
import com.rob.rest.IJourneyRest;
import com.rob.service.IJourneyService;
import com.rob.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/Journey")
public class JourneyRestImpl implements IJourneyRest{
	
	Logger logger = LoggerFactory.getLogger(JourneyRestImpl.class);

	@Autowired
	private IJourneyService service;
	
	@ResponseBody
	@PostMapping(path = "/addJourney", consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public Journey addJourney(@RequestBody Journey journey) {
		logger.info("add Journey create rest...");
		return service.addJourney(journey);
	}
	
}
