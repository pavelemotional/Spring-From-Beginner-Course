package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Library library = context.getBean("library", Library.class);

        library.addABook();

        try {
            library.getBook();
        } catch (Exception e) {
            System.out.println("Книг нет");
        }

        ((AnnotationConfigApplicationContext) context).close();

    }
}
