package aop.ex1.aspects.Example;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectEx1 {
//    @Before("@annotation(aop.ex1.annotation.BeforeGetBookAdvice)")
//    @Before("execution(public void getBook())")
//    @Before("execution(public void aop.ex1.Library.get*())")
//    @Before("execution(public void aop.ex1.Library.get*(String))")
//    @Before("execution(public void aop.ex1.Library.get*(*))")
//    @Before("execution(public void aop.ex1.Library.get*(..))")
//    @Before("execution(public void aop.ex1.Library.getBook(aop.ex1.Book, ..))")
//    @Before("execution(* aop.ex1.Library.get*())")
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу/журнал");
//    }
//    @Before("execution(public * aop.ex1.Library.returnBook())")
//    @Before("execution(* *())")
//    @Before("execution(* aop.ex1.Library.returnBook())")
//    @Before("allReturnMethods()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnBookAdvice: Попытка vernut' книгу/zhurnal");
//    }
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: proverka prav na poluchenie knigi/zhurnala" );
//    }
}
