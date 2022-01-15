package spring_introduction.java_code_configuration_ex1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring_introduction.java_code_configuration_ex1")
@PropertySource("classpath:spring_introduction/myApp.properties")
public class Config {
}
