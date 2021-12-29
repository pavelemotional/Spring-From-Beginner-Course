package spring_introduction.annotation_configuration.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {
    @Value("${person.age}")
    private int age;
    @Value("${person.surname}")
    private String surname;
    private Pet pet;

    @Autowired
    public Person(@Qualifier("dog") Pet pet) {
        this.pet = pet;
    }

    public Person() {
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
