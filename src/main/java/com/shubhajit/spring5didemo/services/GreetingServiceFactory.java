package com.shubhajit.spring5didemo.services;

public class GreetingServiceFactory {
    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            case "fr":
                return new PrimaryFrenchGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
