package aop.ex3.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(public String returnBook())")
    public void returnBookMethod(){};
}
