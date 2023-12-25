package org.example;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LoggingService {

    public LoggingService() {
        System.out.println("LoggingService created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Calling init");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Calling cleanup");
    }
}