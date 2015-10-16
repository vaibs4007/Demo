package com.ail.creyate.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by vaibhav on 15/10/15.
 */

@SpringBootApplication
public class MyApplication {


    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);


    }
}
