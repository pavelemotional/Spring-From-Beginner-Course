package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Library library = context.getBean("library", Library.class);
        Book book = context.getBean("book", Book.class);

//        library.getBook(book, 3);
//        library.getMagazine("GQ");

//        library.getBook();
//        library.getMagazine();

//        library.getBook();
        library.addBook("Pavel", book);
//        library.addMagazine();

        ((AnnotationConfigApplicationContext) context).close();

    }
}
