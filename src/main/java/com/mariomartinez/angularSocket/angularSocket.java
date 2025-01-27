package com.mariomartinez.angularSocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication (scanBasePackages = {"com.mariomartinez.angularSocket.config",
        "com.mariomartinez.angularSocket.controller",
        "com.mariomartinez.angularSocket.models",
        "com.mariomartinez.angularSocket.services",
})

@EnableMongoRepositories(basePackages =
"com.mariomartinez.angularSocket.repositories")
public class angularSocket {
    public static void main (String[] args){
        SpringApplication.run(angularSocket.class, args);
    }
}
