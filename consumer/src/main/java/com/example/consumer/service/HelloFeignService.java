package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: jieliu
 * @title: Service
 * @description:
 * @date: 2020-05-14 10:58
 **/
@Component
@FeignClient(name = "client-a" )
public interface HelloFeignService {

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String test(@RequestParam("name") String name);
}
