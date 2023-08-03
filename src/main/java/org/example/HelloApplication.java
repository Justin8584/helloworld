package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        SpringApplication.run(HelloApplication.class, args);
    }
}