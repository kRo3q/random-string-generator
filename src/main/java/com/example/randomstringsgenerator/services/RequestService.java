package com.example.randomstringsgenerator.services;

import com.example.randomstringsgenerator.Generator;
import com.example.randomstringsgenerator.models.Request;
import com.example.randomstringsgenerator.repositories.IRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class RequestService {
    @Autowired
    IRequestRepository requestRepository;

    public RequestService() {
    }

    public List<Request> getResults(){
        return requestRepository.findAll();
    }

    @Async
    public CompletableFuture<Request> postRequest(Request request) {
        Generator generator = new Generator(
                request.getMinLength(),
                request.getMaxLength(),
                request.getRequestedAmountOfStrings(),
                request.getUsedCharacters());
        request.setGeneratedStrings(generator.generateStrings());
        return CompletableFuture.completedFuture(requestRepository.save(request));
    }

    public int getRunningRequests() {
        List<String> runningRequests = new ArrayList<>();
        String methodOnStack;
        StackTraceElement[] stack = new Throwable().getStackTrace();
        for (StackTraceElement tmp: stack) {
            methodOnStack = tmp.getMethodName();
            if (methodOnStack.contains("post"))
                runningRequests.add(methodOnStack);
        }
        return runningRequests.size();
    }
}
