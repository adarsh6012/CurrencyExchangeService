package com.codefest.currencyexchange.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import com.codefest.currencyexchange.model.ExchangeValue;
import com.codefest.currencyexchange.repository.ExchangeValueRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class CurrencyExchangeServiceApplicationTests {
     @Autowired
    private ExchangeValueRepository repository;
     @Test
      public void findByFromAndToTestUSD() {
       String from="USD";
       String to="INR";
       ExchangeValue myReturnedObject= repository.findByFromAndTo(from, to);
       assertNotNull(myReturnedObject);
       assertTrue(myReturnedObject instanceof ExchangeValue);
       }
   @Test
   public void findByFromAndToTestEUR() {
        String from="EUR";
        String to="INR";
        ExchangeValue myReturnedObject= repository.findByFromAndTo(from, to);
        assertNotNull(myReturnedObject);
        assertTrue(myReturnedObject instanceof ExchangeValue);
      }
    @Test
    public void findByFromAndToTestAUD() {
       String from="AUD";
       String to="INR";
        ExchangeValue myReturnedObject= repository.findByFromAndTo(from, to);
        assertNotNull(myReturnedObject);
        assertTrue(myReturnedObject instanceof ExchangeValue);
        }
}