package aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {

//    @Before("execution(public void getBook())")
    @Before("@annotation(aop.annotation.BeforeGetBookAdvice)")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
    }
    @AfterReturning("execution(public void getBook())")
    public void afterReturningGetBookAdvice(){
        System.out.println("afterReturningGetBookAdvice: Попытка упешна");
    }
    @AfterThrowing("execution(public void getBook())")
    public void afterThrowingGetBookAdvice(){
        System.out.println("afterThrowingGetBookAdvice: Попытка не упешна");
    }
    @After("execution(public void getBook())")
    public void afterFinallyGetBookAdvice(){
        System.out.println("afterFinallyGetBookAdvice: Попытка совершенна");
    }
//    @Around("execution(public void getBook())")
//    public void AroundGetBookAdvice(){
//        System.out.println("AroundGetBookAdvice");
//    }

}
