package com.lobemusonda.learnspringaop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Around("execution(* com.lobemusonda.learnspringaop.*.*.*(..))")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // Start a timer
        long startTime = System.currentTimeMillis();

        // Execute the method
        Object returnValue = proceedingJoinPoint.proceed();

        // Stop timer
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        logger.info("Around Aspect - {} Method executed in {} ms", proceedingJoinPoint, elapsedTime);

        return returnValue;
    }
}
