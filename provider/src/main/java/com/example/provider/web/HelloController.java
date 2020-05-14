package com.example.provider.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jieliu
 * @title: HelloController
 * @description:
 * @date: 2020-05-14 10:57
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name){
        return  "hello " + name;
    }
}
