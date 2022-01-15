package spring_introduction.xml_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.xml_configuration.entities.Pet;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring_introduction/ContextXmlConfiguration.xml");

        Pet pet1 = context.getBean("myPet", Pet.class);
        pet1.say();

        Pet pet2 = context.getBean("myPet2", Pet.class);
        pet2.say();

        ((ClassPathXmlApplicationContext)context).close();

    }
}
