package com.app.project.fics;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.app.project.fics.dao")
@SpringBootApplication
public class FicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FicsApplication.class, args);
    }

}
