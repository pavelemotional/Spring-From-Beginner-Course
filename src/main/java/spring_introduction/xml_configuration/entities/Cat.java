package spring_introduction.xml_configuration.entities;

public class Cat implements Pet {

    @Override
    public void say() {
        Pet.super.say();
        System.out.println("Meow-Meow");
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
