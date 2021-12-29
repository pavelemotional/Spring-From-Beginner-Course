package spring_introduction.java_code_configuration_ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.java_code_configuration_ex1.entities.Person;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("person", Person.class);
        person.callYourPet();

        ((AnnotationConfigApplicationContext) context).close();

    }
}
