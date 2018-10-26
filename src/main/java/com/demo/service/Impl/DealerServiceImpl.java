package com.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Dealer;
import com.demo.repository.DealerRepository;
import com.demo.service.DealerService;

@Service
public class DealerServiceImpl implements DealerService {

    @Autowired
    private DealerRepository dealerRepository;
    
	@Override
	public Dealer getDealerByDealerNo(String dealerNo) {
		// TODO Auto-generated method stub
		
		return dealerRepository.findByDealerNo(dealerNo);
	}

}
