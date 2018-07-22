package com.challenge.adidas.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ChallengeDto {

	private String city;
    
    private String destinycity;
     
    private Date departuretime;
     
    private Date arrivaltime;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDestinycity() {
		return destinycity;
	}

	public void setDestinycity(String destinycity) {
		this.destinycity = destinycity;
	}

	public Date getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(Date departuretime) {
		this.departuretime = departuretime;
	}

	public Date getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(Date arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
 
    
}
