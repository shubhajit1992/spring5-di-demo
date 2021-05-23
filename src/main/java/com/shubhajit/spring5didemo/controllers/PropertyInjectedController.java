package com.shubhajit.spring5didemo.controllers;

import com.shubhajit.spring5didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
