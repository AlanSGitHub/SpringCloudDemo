package com.max.serviceribbon.controller;

import com.max.serviceribbon.service.HelloService;
import com.max.serviceribbon.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Max.
 * @date 2019-3-28
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name)
    {
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/getUser")
    public User getUser()
    {
        return helloService.getUser();
    }
}
