package com.example.randomstringsgenerator.controllers;

import com.example.randomstringsgenerator.models.Request;
import com.example.randomstringsgenerator.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestController {
    @Autowired
    RequestService requestService;
    @GetMapping("results")
    public List<Request> getResults(){
       return requestService.getResults();
    }

    @GetMapping("runningrequests")
    public int getRunningRequests(){
        return requestService.getRunningRequests();
    }
    @PostMapping("request")
    public void postRequest(@RequestBody Request request) throws InterruptedException {
        requestService.postRequest(request);
    }

}
