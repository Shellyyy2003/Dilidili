package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DilidiliApp {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(DilidiliApp.class, args);
    }
}