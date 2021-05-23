package com.shubhajit.spring5didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello!!! - In GreetingServiceImpl";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
