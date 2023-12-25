package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
@Component
public class AppProperties {
    @Value("${app.person.name}")
    private String name;
    @Value("${app.person.surname}")
    private String surname;
    @Value("${app.person.age}")
    private int age;

    public void printInfo() {
        System.out.println(MessageFormat.format("Person info: {0}, {1}, {2}", name, surname, age));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}