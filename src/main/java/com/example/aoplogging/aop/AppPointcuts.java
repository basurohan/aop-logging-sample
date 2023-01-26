package com.example.aoplogging.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppPointcuts {

    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void controllerPointCut() {}

    @Pointcut("within(@org.springframework.stereotype.Service *)")
    public void servicePointCut() {}

    @Pointcut("within(@org.springframework.stereotype.Repository *)")
    public void repositoryPointCut() {}

    @Pointcut("execution(* com.example.aoplogging..*(..))")
    public void appPointCut() {}

    @Pointcut("appPointCut() && (controllerPointCut() || servicePointCut() || repositoryPointCut())")
    public void mainPointcut() {}

}
