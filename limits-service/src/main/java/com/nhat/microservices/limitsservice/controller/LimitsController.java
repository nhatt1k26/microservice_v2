package com.nhat.microservices.limitsservice.controller;

import com.nhat.microservices.limitsservice.bean.Limits;
import com.nhat.microservices.limitsservice.configuration.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private LimitsConfiguration limitsConfiguration;
    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
    }
}
