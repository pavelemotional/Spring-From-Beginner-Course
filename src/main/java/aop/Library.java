package aop;

import aop.annotation.BeforeGetLoggingAdvice;
import org.springframework.stereotype.Component;

@Component
public class Library {

//    @BeforeGetLoggingAdvice
    public void getBook() {
        System.out.println("Мы берём книгу");
        System.out.println("###############################################");
    }
    public void getBook(String bookName) {
        System.out.println("Мы берём книгу " + bookName);
        System.out.println("###############################################");
    }
    public void getBook(Book book, int value) {
        System.out.println("Мы берём книгу " + book.getName() + " " + value + "sht");
        System.out.println("###############################################");
    }

    public void returnBook(){
        System.out.println("Мы vozvrashaem knigu");
        System.out.println("###############################################");
    }
    public void addBook(){
        System.out.println("Мы dobavlyaem knigu");
        System.out.println("###############################################");
    }
    public void addBook(String person_name, Book book){
        System.out.println("Мы dobavlyaem knigu");
        System.out.println("###############################################");
    }

    public void getMagazine(String magazineName){
        System.out.println("Мы берём zhurnal " + magazineName);
        System.out.println("###############################################");
    }
    public void getMagazine(){
        System.out.println("Мы берём zhurnal ");
        System.out.println("###############################################");
    }
    public void returnMagazine(){
        System.out.println("Мы vozvrashaem zhurnal");
        System.out.println("###############################################");
    }
    public void addMagazine(){
        System.out.println("Мы dobavlyaem zhurnal");
        System.out.println("###############################################");
    }
}