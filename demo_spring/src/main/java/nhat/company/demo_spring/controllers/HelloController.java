package nhat.company.demo_spring.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nhat.company.demo_spring.models.Product;

import java.util.List;
@RestController
@RequestMapping(path = "/api/v1/Products")

public class HelloController {
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
