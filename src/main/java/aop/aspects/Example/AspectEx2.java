package aop.aspects.Example;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectEx2 {
//
//    @Pointcut("execution(* aop.Library.get*())")
//    private void allGetMethods() {
//    }
//    @Pointcut("execution(* aop.Library.return*())")
//    private void allReturnMethods() {
//    }
//    @Pointcut("execution(* aop.Library.add*())")
//    private void allAddMethods() {
//    }
//    @Pointcut("allGetMethods() || allReturnMethods()")
//    private void allAddAndReturnMethods() {
//    }
//    @Pointcut("execution(* aop.Library.*(..))")
//    private void allMethods() {
//    }
//    @Pointcut("execution(public void aop.Library.returnMagazine())")
//    private void returnMagazine() {
//    }
//    @Pointcut("allMethods() && !returnMagazine()")
//    private void allMethodsExceptReturnMagazine() {
//    }
//
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethods()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allAddMethods()")
//    public void beforeAddLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #3");
//    }
//
//    @Before("allAddAndReturnMethods()")
//    public void beforeAddAndReturnLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #4");
//    }
//    @Before("allMethodsExceptReturnMagazine()")
//    public void beforeAllMethodsExceptReturnMagazineLoggingAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineLoggingAdvice: writing Log #5");
//    }
}
