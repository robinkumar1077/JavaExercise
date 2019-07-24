package com.rob.service;

import com.rob.modal.Journey;

public interface IJourneyService {
	
	public Journey create(Journey journey);
	
	public Journey addJourney(Journey journey);
	
	public Boolean isTakenSameJourneyMoreThanTwice(Journey journey);
}
