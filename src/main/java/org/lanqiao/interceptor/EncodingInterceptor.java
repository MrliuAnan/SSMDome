package org.lanqiao.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 刘安 on 2017/9/5.
 */
public class EncodingInterceptor implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入字符集拦截器");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //如果返回的是true,方法继续执行,如果是false,请求到这里停止
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("进入字符集postHandle...");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("进入字符集afterCompletion...");
    }
}
