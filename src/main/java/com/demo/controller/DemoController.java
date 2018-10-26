package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Dealer;
import com.demo.service.DealerService;

@RestController
public class DemoController {

    @Resource
    private DealerService dealerService;
	
    @RequestMapping("/")
    public String hello(){
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/dealer")
    @Cacheable(value="user-key")
    public Dealer getDealer(@RequestParam("dealerNo") String dealerNo){
        Dealer dealer = dealerService.getDealerByDealerNo(dealerNo);
        System.err.println("DemoController.getDealer()=========从数据库中进行获取的....Dealer = " + dealerNo);
        return dealer;
    }
}
