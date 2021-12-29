package spring_introduction.java_code_configuration_ex2.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat implements Pet {

    @Override
    public void say() {
        Pet.super.say();
        System.out.println("Meow-Meow");
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
