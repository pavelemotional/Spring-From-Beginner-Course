package aop.ex2.aspects;

import aop.ex2.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("aop.ex2.aspects.Pointcuts.getStudentsMethod()")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: " +
                "Логируем получение списка студентов " +
                "перед работой метода");
    }

    @AfterReturning(pointcut = "aop.ex2.aspects.Pointcuts.getStudentsMethod()",
            returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr." + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterGetStudentsLoggingAdvice: " +
                "Логируем получение списка студентов " +
                "после удачной работы метода");
    }

    @AfterThrowing(pointcut = "aop.ex2.aspects.Pointcuts.getStudentsMethod()",
            throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice:" +
                " Logiruem vibros isklucheniya " + exception);
    }

    @After("aop.ex2.aspects.Pointcuts.getStudentsMethod()")
    public void afterFinallyGetStudentsLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String name = methodSignature.getName();

        System.out.println("afterFinallyGetStudentsLoggingAdvice:" +
                " Logiruem vibros isklucheniya  ili normal'nuy rabotu methoda " + name);
    }
}
