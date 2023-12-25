package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class SingletonClass {

    public SingletonClass() {
        System.out.println("Singleton");
    }
}