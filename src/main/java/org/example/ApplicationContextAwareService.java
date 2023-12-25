package org.example;

import org.springframework.stereotype.Component;

@Component
public class ApplicationContextAwareService implements ApplicationContextAware {
    private String application;

    public void printApplication() {
        System.out.println("Aware - " + application);
    }
}