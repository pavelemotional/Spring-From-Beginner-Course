package aop.ex1.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("aop.ex1.aspects.pointcuts.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: lovim/obrabativaem excepton" +
                "pri popitke poluchit' knigu/zhurnal");
        System.out.println("###############################################");
    }
    @Before("aop.ex1.aspects.pointcuts.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: lovim/obrabativaem excepton" +
                "pri popitke poluchit' knigu/zhurnal");
        System.out.println("###############################################");
    }
}
