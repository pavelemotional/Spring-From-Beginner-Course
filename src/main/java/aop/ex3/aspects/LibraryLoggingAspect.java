package aop.ex3.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LibraryLoggingAspect {

    @Around("aop.ex3.aspects.Pointcuts.returnBookMethod()")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {

        Object targetMethodResult;
        long methodExecutionTime;

        System.out.println("aroundReturnBookLoggingAdvice: v biblioteku pitautsya vernut' knigu");

        try {
            methodExecutionTime = System.currentTimeMillis();
            targetMethodResult = proceedingJoinPoint.proceed();
            methodExecutionTime = System.currentTimeMillis() - methodExecutionTime;

            targetMethodResult = "nasha izmenennaya kniga";

            System.out.println("aroundReturnBookLoggingAdvice: v biblioteku Uspeshno vernuli knigu knigu");
            System.out.println("Vremya vipolneniya methoda returnBook() " + methodExecutionTime + "mls");

            return targetMethodResult;

        } catch (Exception e) {
            System.out.println("Poimano iskluchenie " + e.getMessage());
            targetMethodResult = "Neizvestnoe nazvznie knigi";
            throw e;
        }

    }
}
