package com.example.randomstringsgenerator.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileGeneratorController {
    @GetMapping("/hello")
    public String Hello() {
        return "hello";
    }
}
