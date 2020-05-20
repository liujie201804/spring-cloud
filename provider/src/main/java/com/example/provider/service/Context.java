package com.example.provider.service;

/**
 * @author: jieliu
 * @title: Context
 * @description:
 * @date: 2020-05-20 17:28
 **/
public class Context {

    private BaseStrategy mBaseStrategy = null;

    public Context(BaseStrategy baseStrategy) {
        mBaseStrategy = baseStrategy;
    }

    public void upload(String path) {
         mBaseStrategy.upload(path);
    }

    public void download(String path) {
         mBaseStrategy.download(path);
    }

}
