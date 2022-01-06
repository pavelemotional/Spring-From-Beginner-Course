package aop.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Library library = context.getBean("library", Library.class);
        String bookName = library.returnBook();

        System.out.println("V biblioteku vernuli knigu " + bookName);

        ((AnnotationConfigApplicationContext)context).close();
    }
}
