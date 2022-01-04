package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Война и Мир")
    private String author;
    @Value("Dostoevskiy")
    private String name;
    @Value("1866")
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
