package com.challenge.adidas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.adidas.dto.ChallengeDto;
import com.challenge.adidas.service.ChallengeAdidasService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
@Transactional
public class ChallengeAdidasController {
	
	@Autowired
	ChallengeAdidasService challengeAdidasService;
	
	
	@RequestMapping(value = "/itinerary/{city}/{destinycity}", method = RequestMethod.GET)
    public ResponseEntity<?> getLessConnections(@PathVariable("city") String city, 
    											@PathVariable("destinycity") String destinycity) {
        List<ChallengeDto> dto = challengeAdidasService.getLessNumberConnections(city, destinycity);
        if (dto == null) {
            return new ResponseEntity(new Error("City " + city + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<ChallengeDto>>(dto, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/time/{city}/{destinycity}", method = RequestMethod.GET)
    public ResponseEntity<?> getLessTime(@PathVariable("city") String city, 
    											@PathVariable("destinycity") String destinycity) {
        List<ChallengeDto> dto = challengeAdidasService.getLessTime(city, destinycity);
        if (dto == null) {
            return new ResponseEntity(new Error("City " + city + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<ChallengeDto>>(dto, HttpStatus.OK);
    }
	

}
