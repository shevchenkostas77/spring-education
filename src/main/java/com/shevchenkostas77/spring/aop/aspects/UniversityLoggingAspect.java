package com.shevchenkostas77.spring.aop.aspects;

import com.shevchenkostas77.spring.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
                "списка студентов перед методом getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
            returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {

        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrate = firstStudent.getAvgGrade();
        avgGrate = avgGrate + 1;
        firstStudent.setAvgGrade(avgGrate);

        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
                "списка студентов после работы метода getStudents");
    }
}
