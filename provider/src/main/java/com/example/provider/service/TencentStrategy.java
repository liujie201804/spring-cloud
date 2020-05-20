package com.example.provider.service;

/**
 * @author: jieliu
 * @title: TencentStrategy
 * @description:
 * @date: 2020-05-20 17:22
 **/
public class TencentStrategy implements BaseStrategy{

    @Override
    public void upload(String path) {
        System.out.println("tencent 上传");
    }

    @Override
    public void download(String path) {
        System.out.println("tencent 下载");
    }
}
