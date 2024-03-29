package com.nhat220801.microservices.currencyexchangemicroservice.controller;

import com.nhat220801.microservices.currencyexchangemicroservice.repository.CurrencyExchangeRepository;
import com.nhat220801.microservices.currencyexchangemicroservice.bean.CurrencyExchange;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Setter(onMethod_ = @Autowired)
public class CurrencyExchangeController {
    private Environment environment;
    private CurrencyExchangeRepository currencyExchangeRepository;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
        String port = environment.getProperty("local.server.port");
        CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from,to);
        if (currencyExchange==null)
                throw new RuntimeException("Data is null");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }
}
