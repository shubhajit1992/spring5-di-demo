package com.shubhajit.spring5didemo.services;

public class PrimaryFrenchGreetingService implements GreetingService {
    private final GreetingRepository greetingRepository;

    public PrimaryFrenchGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getFrenchGreeting();
    }
}
