package com.max.serviceribbon.service;

import com.max.serviceribbon.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Max.
 * @date 2019-3-28
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-PRODUCER/hello?name=" + name, String.class);
    }

    public User getUser() {
        return restTemplate.getForObject("http://EUREKA-PRODUCER/getUser", User.class);
    }
}
