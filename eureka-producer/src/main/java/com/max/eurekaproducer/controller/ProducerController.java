package com.max.eurekaproducer.controller;

import com.max.eurekaproducer.vo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Max.
 * @date 2019-3-28
 */
@RestController
public class ProducerController {

    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String application;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + ",this is " + application + " project(" + port + ").";
    }

    @GetMapping("/getUser")
    public User getUser() {
        return new User("Max.", 18, application);
    }
}
