package com.studentAPI.StudentDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.studentAPI.StudentDatabase","com.controller","com.model"})
public class App {
    public static void main(String[] args) {
       SpringApplication.run(App.class, args);
    }
}
