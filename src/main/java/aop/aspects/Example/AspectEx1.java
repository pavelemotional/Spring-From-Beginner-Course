package aop.aspects.Example;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectEx1 {
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
