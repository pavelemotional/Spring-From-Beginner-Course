package aop.ex2.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* getStudents())")
    public void getStudentsMethod(){};

    @Pointcut("execution(public String returnBook())")
    public void returnBookMethod(){};
}
