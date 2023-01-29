package com.codefest.currencyexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codefest.currencyexchange.model.ExchangeValue;
import com.codefest.currencyexchange.service.CurrencyExchangeService;


@RestController
public class CurrencyExchangeController {

	@Autowired
	private CurrencyExchangeService service;
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		return service.retrieveExchangeValue(from, to);
	}
}