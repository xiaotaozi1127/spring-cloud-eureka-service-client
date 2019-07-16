package com.cloud.spring.eureka.service.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/hello2")
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") int age){
        return new User(name, age);
    }

    @PostMapping("/hello3")
    public String hello(@RequestBody User user){
        return "hello " + user.toString();
    }
}
