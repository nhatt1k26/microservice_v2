package com.example.demo_api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import com.example.demo_api.repositories.ProductRepositories;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(path = "api/v1/Products")
public class controllers {

    // @Autowired
    // private ProductRepositories repositories;


    @GetMapping(path="")
    List<String> getMethodName() {
        return List.of(
            "Haha","hahahah"
        );
    }
    
}
