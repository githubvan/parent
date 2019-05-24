package com.van.provider.service.Impl;

import com.van.provider.service.ThreadLocalService;

/**
 * @Classname ThreadLocalServiceImpl
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/24 11:24
 * @Version 1.0
 **/
public class ThreadLocalServiceImpl implements ThreadLocalService {

    private ThreadLocal<String> threadLocal=new ThreadLocal<>();


    @Override
    public void testThreadLocal() {
        threadLocal.set("123");
        String s = threadLocal.get();
        System.out.println(s);
    }
}
