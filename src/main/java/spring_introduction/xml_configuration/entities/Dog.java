package spring_introduction.xml_configuration.entities;

public class Dog implements Pet {

    @Override()
    public void say() {
        Pet.super.say();
        System.out.println("Bow-Wow");
    }

    @Override
    public void init() {
        Pet.super.init();
    }

    @Override
    public void destroy() {
        Pet.super.destroy();
    }
}
