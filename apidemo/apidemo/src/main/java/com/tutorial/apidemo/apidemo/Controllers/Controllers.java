package com.tutorial.apidemo.apidemo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")

public class Controller {
    @GetMapping("")
    List<String> getAllProducts(){
        Product P1 = new Product("haha","haa");
        Product P2 = new Product("ahsd","ashdj");
        return List.of(
                P1.AddSum(),
                P2.AddSum()
        );
    }
}
