package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        1
//        ApplicationContext context = new AnnotationConfigApplicationContext(UserService.class);
//        context.getBean(UserService.class);
//        2
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        LoggingService loggingService = context.getBean(LoggingService.class);
//        ((AbstractApplicationContext) context).getBeanFactory().destroyBean("loggingService", loggingService);
//        3
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.getBean(ApplicationContextAwareService.class).printApplication();
//        4
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(AppProperties.class).printInfo();
    }
}