package aop.ex1.aspects.pointcuts;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* aop.ex1.Library.get*(..))")
    public void allGetMethods(){}

    @Pointcut("execution(* aop.ex1.Library.add*(..))")
    public void allAddMethods(){}
}
