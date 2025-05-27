package com.lobemusonda.learnspringaop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.lobemusonda.learnspringaop.*.*.*(..))")
    public void businessAndDataPackageConfig() {}

    @Pointcut("execution(* com.lobemusonda.learnspringaop.business.*.*(..))")
    public void businessPackageConfig() {}

    @Pointcut("execution(* com.lobemusonda.learnspringaop.data.*.*(..))")
    public void dataPackageConfig() {}

    @Pointcut("bean(*Service*)")
    public void dataPackageConfigUsingBean() {}
}
