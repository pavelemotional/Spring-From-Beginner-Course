package aop.ex3;

import org.springframework.stereotype.Component;

@Component
public class Library {

    public void getBook() {
        System.out.println("Berem Knigu");
        System.out.println("#################################################");

    }

    public String returnBook() {
        int i = 10 / 0;
        System.out.println("Vozvrashaem knigu");
        System.out.println("#################################################");
        return "Voina i Mir";
    }
}
