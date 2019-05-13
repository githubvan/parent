package com.van.apigetway.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @Classname secondFilter
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/13 16:11
 * @Version 1.0
 **/
public class secondFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("second");
        return null;
    }
}
