package com.challenge.adidas.service;

import java.util.List;

import com.challenge.adidas.dto.ChallengeDto;

public interface ChallengeAdidasService {
	
	List<ChallengeDto> getLessNumberConnections(String city, String destinycity);

	List<ChallengeDto> getLessTime(String city, String destinycity);
	
}
