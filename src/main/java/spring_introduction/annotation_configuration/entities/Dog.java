package spring_introduction.annotation_configuration.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Dog implements Pet {

    @Override()
    public void say() {
        Pet.super.say();
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    @Override
    public void init() {
        Pet.super.init();
    }

    @PreDestroy
    @Override
    public void destroy() {
        Pet.super.destroy();
    }
}
