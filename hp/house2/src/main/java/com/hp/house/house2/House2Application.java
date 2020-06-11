package com.hp.house.house2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class House2Application {

    public static void main(String[] args) {
        SpringApplication.run(House2Application.class, args);
    }

}
