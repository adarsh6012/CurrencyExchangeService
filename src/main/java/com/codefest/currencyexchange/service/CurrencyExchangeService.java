package com.codefest.currencyexchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.codefest.currencyexchange.model.ExchangeValue;
import com.codefest.currencyexchange.repository.ExchangeValueRepository;



@Service
public class CurrencyExchangeService {
	
	@Autowired
	private ExchangeValueRepository repository;
	
	@Autowired
	private Environment environment;
	
	
public ExchangeValue retrieveExchangeValue(String from,String to) {
		
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}

}
