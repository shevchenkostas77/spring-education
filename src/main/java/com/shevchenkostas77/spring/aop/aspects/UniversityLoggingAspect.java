package com.shevchenkostas77.spring.aop.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrate = firstStudent.getAvgGrade();
//        avgGrate = avgGrate + 1;
//        firstStudent.setAvgGrade(avgGrate);
//
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после работы метода getStudents");

    @AfterThrowing(pointcut = "execution(* getStudents())",
            throwing = "exception")
    public void afterThrowingingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingingGetStudentsLoggingAdvice: логируем выброс " +
                "исключения " + exception);
    }
}
