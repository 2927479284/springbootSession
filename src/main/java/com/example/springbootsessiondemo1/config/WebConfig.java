package com.example.springbootsessiondemo1.config;

import com.example.springbootsessiondemo1.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Resource
    private LoginInterceptor loginIntercept;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(loginIntercept).
                addPathPatterns("/**").    // 拦截所有 url
                excludePathPatterns("/auth/login"); //不拦截登录接口
    }
}
