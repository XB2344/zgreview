package com.zgreviewsystem.review_usermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zgreviewsystem.review_usermanager.Mapper")
public class ReviewUsermanagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ReviewUsermanagerApplication.class, args);
    }

}

