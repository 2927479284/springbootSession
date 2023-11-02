package com.example.springbootsessiondemo1.config;

import com.example.springbootsessiondemo1.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Resource
    private LoginInterceptor loginIntercept;


    @Value("${file.storage.path}")
    private String fileStoragePath;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(loginIntercept)
                .addPathPatterns("/**")    // 拦截所有 url
                .excludePathPatterns("/auth/login") //不拦截登录接口
                .excludePathPatterns("/upload/image") //不拦截文件上传接口
                .excludePathPatterns("/uploads/**"); //不拦截图片预览接口
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:" + fileStoragePath); // 替换为实际的文件存储路径
    }
}
