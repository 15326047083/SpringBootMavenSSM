package com.ambow.leiyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ambow.leiyuan.dao")
@SpringBootApplication
public class SsmtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmtestApplication.class, args);
    }

}
