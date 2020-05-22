package com.example.provider.web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author: jieliu
 * @title: TestController
 * @description:
 * @date: 2020-05-20 09:23
 **/
@RequestMapping("test")
@RestController
public class TestController {

    @PostMapping(value = "add", produces = "application/json;charset=UTF-8")
    public void add(@RequestBody JSONObject jsonpObject) {
        System.out.println(jsonpObject.toJSONString());
    }
}
