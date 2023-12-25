package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class PrototypeClass {

    public PrototypeClass() {
        System.out.println("Prototype");
    }
}