package aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectEx {

    @Pointcut("execution(* aop.Library.get*())")
    private void allGetMethods() {
    }
    @Pointcut("execution(* aop.Library.return*())")
    private void allReturnMethods() {
    }
    @Pointcut("execution(* aop.Library.add*())")
    private void allAddMethods() {
    }
    @Pointcut("allGetMethods() || allReturnMethods()")
    private void allAddAndReturnMethods() {
    }
    @Pointcut("execution(* aop.Library.*(..))")
    private void allMethods() {
    }
    @Pointcut("execution(public void aop.Library.returnMagazine())")
    private void returnMagazine() {
    }
    @Pointcut("allMethods() && !returnMagazine()")
    private void allMethodsExceptReturnMagazine() {
    }


    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethods()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #2");
    }

    @Before("allAddMethods()")
    public void beforeAddLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #3");
    }

    @Before("allAddAndReturnMethods()")
    public void beforeAddAndReturnLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #4");
    }
    @Before("allMethodsExceptReturnMagazine()")
    public void beforeAllMethodsExceptReturnMagazineLoggingAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineLoggingAdvice: writing Log #5");
    }

//    @Before("@annotation(aop.annotation.BeforeGetBookAdvice)")
//    @Before("execution(public void getBook())")
//    @Before("execution(public void aop.Library.get*())")
//    @Before("execution(public void aop.Library.get*(String))")
//    @Before("execution(public void aop.Library.get*(*))")
//    @Before("execution(public void aop.Library.get*(..))")
//    @Before("execution(public void aop.Library.getBook(aop.Book, ..))")
//    @Before("execution(* aop.Library.get*())")
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу/журнал");
//    }
//    @Before("execution(public * aop.Library.returnBook())")
//    @Before("execution(* *())")
//    @Before("execution(* aop.Library.returnBook())")
//    @Before("allReturnMethods()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnBookAdvice: Попытка vernut' книгу/zhurnal");
//    }
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: proverka prav na poluchenie knigi/zhurnala" );
//    }
}
