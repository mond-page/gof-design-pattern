package com.mond.gofdesignpattern.proxy.java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("bean(gameService)")
    public void timestamp(ProceedingJoinPoint point) throws Throwable {
        long currentTimeMillis = System.currentTimeMillis();
        point.proceed();
        System.out.println(System.currentTimeMillis() - currentTimeMillis);
    }
}
