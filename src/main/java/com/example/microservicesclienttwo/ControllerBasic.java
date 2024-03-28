package com.example.microservicesclienttwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerBasic {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("helloTwo")
    public String get() {
        String str = restTemplate.getForObject("http://localhost:9091"+"/hello", String.class);
        return str+"=>microservices-two";
    }
}
