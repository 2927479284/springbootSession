package com.example.springbootsessiondemo1.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * session校验拦截器
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1.得到 HttpSession 对象
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("session") != null) {
            // 表示已经登录
            return true;
        }
        // 执行到此代码表示未登录，未登录就跳转到登录页面
        return false;
    }
}
