package aop;

import aop.annotation.BeforeGetBookAdvice;
import org.springframework.stereotype.Component;

@Component
public class Library {
    int book = 0;

    public void setBook(int book) {
        this.book = book;
    }

    public void addABook() {
        book++;
    }

    @BeforeGetBookAdvice
    public void getBook() throws Exception {
        System.out.println("Мы берём книгу");
        if (book < 1) throw new Exception();
    }
}