package aop.ex1.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("aop.ex1.aspects.pointcuts.MyPointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: proverka prav na poluchenie knigi/zhurnala");
        System.out.println("###############################################");
    }
    @Before("aop.ex1.aspects.pointcuts.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeAddSecurityAdvice: proverka prav na poluchenie knigi/zhurnala");
        System.out.println("###############################################");
    }
}
