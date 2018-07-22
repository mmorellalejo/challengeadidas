package com.challenge.adidas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.challenge.adidas.entity.ChallengeEntity;

@Repository
public interface ChallengeAdidasRepository extends JpaRepository<ChallengeEntity, String> {

	@Query("SELECT c FROM Cities c WHERE c.city = :city AND c.destinycity = :destinycity")
	List<ChallengeEntity> getLessNumberConn(String city, String destinycity);

	@Query("SELECT c FROM Cities c WHERE c.city = :city AND c.destinycity = :destinycity ORDER BY c.arrivaltime")
	List<ChallengeEntity> getLessTime(String city, String destinycity);

}
