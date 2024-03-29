package com.nhat220801.microservices.currencyexchangemicroservice.repository;

import com.nhat220801.microservices.currencyexchangemicroservice.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {
    CurrencyExchange findByFromAndTo(String from,String to);
}
