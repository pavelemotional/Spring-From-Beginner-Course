package spring_introduction.annotation_configuration;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.annotation_configuration.entities.Person;
import spring_introduction.annotation_configuration.entities.Pet;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring_introduction/ContextAnnotationConfiguration.xml");

        Pet pet1 = context.getBean("cat", Pet.class);
        pet1.say();

        Person person1 = context.getBean("person", Person.class);
        person1.callYourPet();
        System.out.println(person1);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
