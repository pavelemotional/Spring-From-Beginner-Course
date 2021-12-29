package spring_introduction.xml_configuration.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
    private int age;
    private String surname;
    private Pet pet;


    public Person(Pet pet) {
        this.pet = pet;
    }

    public Person() {
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet");
        pet.say();
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    public void init() {
        System.out.println(this.getClass().getSimpleName() + " bean is initialized");
    }

    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + " bean destroyed");
    }

}
