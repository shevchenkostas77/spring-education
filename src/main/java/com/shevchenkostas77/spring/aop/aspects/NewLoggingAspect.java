package com.shevchenkostas77.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {

        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "пытаются вернуть книгу");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        targetMethodResult = "\"Преступление и наказание\"";

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "успешно вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook " +
                "выполнил работу за " + (end - begin) + " миллисекунд");
        return targetMethodResult;
    }
}
