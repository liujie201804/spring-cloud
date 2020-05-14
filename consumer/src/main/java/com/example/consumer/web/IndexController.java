package com.example.consumer.web;

import com.example.consumer.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: jieliu
 * @title: IndexController
 * @description:
 * @date: 2020-05-14 11:00
 **/
@RestController
public class IndexController {

    @Autowired
    private HelloFeignService feignService;

    @GetMapping(value = "/hello")
    public String hello(String name){
        return feignService.test(name);
    }

}
