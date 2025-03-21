package com.example.onlinestore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@MapperScan("com.example.onlinestore.mapper")
@RefreshScope
public class OnlineStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineStoreApplication.class, args);
    }
} 