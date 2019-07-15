package com.cloud.spring.eureka.service.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String index(){
        return "hello world from port:" + port;
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam String name){
        return "Hello " + name;
    }
}
