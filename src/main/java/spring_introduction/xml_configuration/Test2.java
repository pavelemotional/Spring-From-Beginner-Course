package spring_introduction.xml_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.xml_configuration.entities.Person;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ContextXmlConfiguration.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person);

        ((ClassPathXmlApplicationContext)context).close();
    }
}
