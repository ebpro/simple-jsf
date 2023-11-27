package fr.univtln.bruno.sample.jsf;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String getGreetingTemplate() {
        return "Hello";
    }
}
