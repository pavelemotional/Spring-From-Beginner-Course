package spring_introduction.java_code_configuration_ex2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.java_code_configuration_ex2.entities.Person;
import spring_introduction.java_code_configuration_ex2.entities.Pet;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Pet pet = context.getBean("petBean", Pet.class);
        pet.say();

        System.out.println("\n########################################\n");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println("person = " + person);

        ((AnnotationConfigApplicationContext) context).close();
    }
}
