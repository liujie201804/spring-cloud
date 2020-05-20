package com.example.provider.web;

import com.example.provider.model.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: jieliu
 * @title: HelloController
 * @description:
 * @date: 2020-05-14 10:57
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello " + name;
    }

    public static void main(String[] args) {

        ArrayList<User> objects = new ArrayList<>();

        List<User> amsAssetList = new ArrayList<>();
        amsAssetList.add(new User(1, "ee", 1));
        amsAssetList.add(new User(2, "qq", 2));
        amsAssetList.add(new User(3, "ww", 3));
        // 从amsAssetList数据中封装id->managerName map
        amsAssetList.stream().filter(user -> user.getAge() > 2).forEach(user -> objects.add(user));

        objects.forEach(ee -> {
                    System.out.println(ee);
                }
        );

        //获取对象中所有id的集合
//        List<Integer> idList = amsAssetList.stream().map(User::getId).collect(Collectors.toList());
//        Optional<String> stringOptional = Optional.of("张三");
//        System.out.println(stringOptional.orElseGet(() -> "zhangsan"));
//        Optional<String> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional.orElseGet(() -> "orElseGet"));
//
//        User user = null;
//        String code = null;
//        if (Optional.ofNullable(code).isPresent()) {
//            System.out.println("Eeee");
//        }

        Map<String, Integer> items = new HashMap<>();
        items.put("null", 100);
        items.forEach((k, v) -> {
            if (Optional.ofNullable(k).isPresent()) {
                System.out.println(v);
            }
        });
    }
}
