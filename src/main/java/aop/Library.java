package aop;

import aop.annotation.BeforeGetLoggingAdvice;
import org.springframework.stereotype.Component;

@Component
public class Library {

    @BeforeGetLoggingAdvice
    public void getBook() {
        System.out.println("Мы берём книгу");
    }
    public void getBook(String bookName) {
        System.out.println("Мы берём книгу " + bookName);
    }
    public void getBook(Book book, int value) {
        System.out.println("Мы берём книгу " + book.getName() + " " + value + "sht");
    }

    public void returnBook(){
        System.out.println("Мы vozvrashaem knigu");
    }
    public void addBook(){
        System.out.println("Мы dobavlyaem knigu");
    }

    public void getMagazine(String magazineName){
        System.out.println("Мы берём zhurnal " + magazineName);
    }
    public void getMagazine(){
        System.out.println("Мы берём zhurnal ");
    }
    public void returnMagazine(){
        System.out.println("Мы vozvrashaem zhurnal");
    }
    public void addMagazine(){
        System.out.println("Мы dobavlyaem zhurnal");
    }
}