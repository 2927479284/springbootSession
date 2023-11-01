package com.example.springbootsessiondemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


// exclude = {DataSourceAutoConfiguration.class}
@SpringBootApplication
@MapperScan("com.example.springbootsessiondemo1.mapper")
public class SpringBootSessionDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSessionDemo1Application.class, args);
    }

}
