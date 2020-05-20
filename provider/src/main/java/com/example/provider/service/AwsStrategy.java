package com.example.provider.service;

/**
 * @author: jieliu
 * @title: AwsStrategy
 * @description:
 * @date: 2020-05-20 17:22
 **/
public class AwsStrategy implements BaseStrategy{

    @Override
    public void upload(String path) {
        System.out.println("aws 上传");
    }

    @Override
    public void download(String path) {
        System.out.println("aws download");
    }
}
