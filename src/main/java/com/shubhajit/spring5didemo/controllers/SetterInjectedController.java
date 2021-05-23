package com.shubhajit.spring5didemo.controllers;

import com.shubhajit.spring5didemo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
