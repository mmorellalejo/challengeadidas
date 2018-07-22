package com.challenge.adidas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cities")
public class ChallengeEntity {

	@Id
    private String city;
	
	@Column
    private String destinycity;
	
	@Column
    private Date departuretime;
	
	@Column
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
