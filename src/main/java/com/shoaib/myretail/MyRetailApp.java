package com.shoaib.myretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.shoaib.myretail.repository")
public class MyRetailApp {

    public static void main(String[] args) {
        SpringApplication.run(MyRetailApp.class, args);
    }
}
