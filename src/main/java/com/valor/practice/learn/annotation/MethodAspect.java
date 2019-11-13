package com.valor.practice.learn.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/6/3 16:24
 * Description:
 */
@Aspect
@Component
@Slf4j
public class MethodAspect {

    @Pointcut("@annotation(com.valor.practice.learn.annotation.MethodAop)") // 注解声明切点，注解的全限定名
    public void annotationPointcut() {
    };

    @After("annotationPointcut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        String name = method.getName();
        MethodAop annotation = method.getAnnotation(MethodAop.class);
        log.info("拦截 : {} 方法执行",name);
    }
}
