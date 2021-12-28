package spring_introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet1 = context.getBean("myPet", Pet.class);
        pet1.say();
        Pet pet2 = context.getBean("myPet2", Pet.class);
        pet2.say();

    }
}
