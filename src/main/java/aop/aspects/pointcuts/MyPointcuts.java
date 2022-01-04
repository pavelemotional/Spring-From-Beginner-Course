package aop.aspects.pointcuts;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* aop.Library.get*(..))")
    public void allGetMethods(){}

    @Pointcut("execution(* aop.Library.add*(..))")
    public void allAddMethods(){}
}
