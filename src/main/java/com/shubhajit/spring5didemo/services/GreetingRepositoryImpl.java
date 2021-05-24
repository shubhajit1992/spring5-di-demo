package com.shubhajit.spring5didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello!!! - In Primary Greeting Service";
    }

    @Override
    public String getFrenchGreeting() {
        return "Bonjour!!! - Dans le service d'accueil principal";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola!!! - En servicio de saludo primario";
    }
}
