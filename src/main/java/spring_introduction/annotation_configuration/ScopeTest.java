package spring_introduction.annotation_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.annotation_configuration.entities.Pet;

public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring_introduction/ContextAnnotationConfiguration.xml");

        Pet petSingleton1 = context.getBean("dog", Pet.class);
        Pet petSingleton2 = context.getBean("dog", Pet.class);

        Pet petPrototype1 = context.getBean("cat", Pet.class);
        Pet petPrototype2 = context.getBean("cat", Pet.class);


        System.out.println("\n#############################################"
                + "\nОдин и тот же обьект petSingleton1 и petSingleton2? "
                + (petSingleton1 == petSingleton2)
                + "\nОдин и тот же обьект petPrototype1 и petPrototype2? "
                + (petPrototype1 == petPrototype2)
                + "\n#############################################\n");


        ((ClassPathXmlApplicationContext) context).close();
    }
}
