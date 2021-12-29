package spring_introduction.java_code_configuration_ex2.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements Pet {

    @Override()
    public void say() {
        Pet.super.say();
        System.out.println("Bow-Wow");
    }

    @Override
    @PostConstruct
    public void init() {
        Pet.super.init();
    }

    @Override
    @PreDestroy
    public void destroy() {
        Pet.super.destroy();
    }
}
