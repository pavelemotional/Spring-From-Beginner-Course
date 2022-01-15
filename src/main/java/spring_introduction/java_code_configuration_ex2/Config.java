package spring_introduction.java_code_configuration_ex2;

import org.springframework.context.annotation.*;
import spring_introduction.java_code_configuration_ex2.entities.Cat;
import spring_introduction.java_code_configuration_ex2.entities.Person;
import spring_introduction.java_code_configuration_ex2.entities.Pet;

@Configuration
@PropertySource("classpath:spring_introduction/myApp.properties")
public class Config {

    @Bean
    @Scope("singleton")
    public Pet petBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(petBean());
    }
}
