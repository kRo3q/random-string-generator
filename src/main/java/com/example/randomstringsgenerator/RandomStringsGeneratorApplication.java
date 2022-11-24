package com.example.randomstringsgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class RandomStringsGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomStringsGeneratorApplication.class, args);
    }

}
