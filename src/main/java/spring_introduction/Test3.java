package spring_introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Pet pet = new Cat();
//        Person person = new Person(pet);
//        person.callYourPet();

//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        person.callYourPet();

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

    }
}
