package com.example.databasedemo1tree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.databasedemo1tree.mapper")
public class DatabaseDemo1TreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemo1TreeApplication.class, args);
    }

}
