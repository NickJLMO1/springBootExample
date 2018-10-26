package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Long> {
	
	Dealer findByDealerNo(String dealerNo);

}
