package com.van.apigetway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * @Classname AccessFilter
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/13 14:57
 * @Version 1.0
 **/
@Slf4j
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;  //true执行过滤 ，false不过滤
    }

    @Override
    public Object run() {
        System.out.println("first");
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletResponse response = currentContext.getResponse();
        response.setContentType("text/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");  //防止乱码

        HttpServletRequest request = currentContext.getRequest();
        log.info("send {} request to {}", request.getMethod(), request.getRequestURI());
      /*  Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> strings = parameterMap.keySet();
        for (String key : strings) {
            String[] strings1 = parameterMap.get(key);
            System.out.println("key==:" + key + ",value==:" + Arrays.toString(strings1));
        }
        return null;*/

      /*token验证*/
        String token = request.getParameter("token");
        if (StringUtils.isBlank(token)) {
            currentContext.setSendZuulResponse(false); //不对其进行其路由
            currentContext.setResponseStatusCode(401);//状态码
            currentContext.setResponseBody("token为空");
            return null;
        }
        return null;

    }
}
