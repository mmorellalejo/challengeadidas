package com.challenge.adidas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.adidas.dto.ChallengeDto;
import com.challenge.adidas.entity.ChallengeEntity;
import com.challenge.adidas.repository.ChallengeAdidasRepository;
import com.challenge.adidas.service.ChallengeAdidasService;

@Service("challengeAdidasService")
public class ChallengeAdidasServiceImpl implements ChallengeAdidasService {

	@Autowired
	ChallengeAdidasRepository adidasRepository;
	
	@Override
	public List<ChallengeDto> getLessNumberConnections(String city, String destinycity) {
		List<ChallengeDto> listDto = new ArrayList<>();
		List<ChallengeEntity> entities = adidasRepository.getLessNumberConn(city, destinycity);
		for (ChallengeEntity challengeEntity : entities) {
			ChallengeDto dto = new ChallengeDto();
			dto.setCity(challengeEntity.getCity());
			dto.setDestinycity(challengeEntity.getDestinycity());
			dto.setDeparturetime(challengeEntity.getDeparturetime());
			dto.setArrivaltime(challengeEntity.getArrivaltime());
			listDto.add(dto);
		}
		return listDto;
	}

	@Override
	public List<ChallengeDto> getLessTime(String city, String destinycity) {
		List<ChallengeDto> listDto = new ArrayList<>();
		List<ChallengeEntity> entities = adidasRepository.getLessTime(city, destinycity);
		for (ChallengeEntity challengeEntity : entities) {
			ChallengeDto dto = new ChallengeDto();
			dto.setCity(challengeEntity.getCity());
			dto.setDestinycity(challengeEntity.getDestinycity());
			dto.setDeparturetime(challengeEntity.getDeparturetime());
			dto.setArrivaltime(challengeEntity.getArrivaltime());
			listDto.add(dto);
		}
		return listDto;
	}

	
}
