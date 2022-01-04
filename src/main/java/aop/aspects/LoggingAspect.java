package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("aop.aspects.pointcuts.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Popitka poluchit' knigu/zhurnal");
        System.out.println("###############################################");
    }

    @Before("aop.aspects.pointcuts.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature = " + methodSignature);

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();

            Arrays.stream(args).forEach(obj -> {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге:" +
                            "\nNazvznie - " + myBook.getName() +
                            "\nAvtor - " + myBook.getAuthor() +
                            "\nGod publikacii - " + myBook.getYearOfPublication());
                } else if(obj instanceof String){
                    System.out.println("Knigu dobavlyaet " + (String) obj);
                }
            });
        }

        System.out.println("beforeAddLoggingAdvice: Popitka poluchit' knigu/zhurnal");
        System.out.println("###############################################");
    }


}

