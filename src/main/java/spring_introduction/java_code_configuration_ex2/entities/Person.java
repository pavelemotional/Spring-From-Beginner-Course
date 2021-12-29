package spring_introduction.java_code_configuration_ex2.entities;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getSimpleName() + " bean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + " bean destroyed");
    }

}
