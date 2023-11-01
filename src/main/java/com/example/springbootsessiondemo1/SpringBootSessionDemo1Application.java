package com.example.springbootsessiondemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootSessionDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSessionDemo1Application.class, args);
    }

}
