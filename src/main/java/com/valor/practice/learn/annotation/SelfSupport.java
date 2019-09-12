package com.valor.practice.learn.annotation;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/6/3 15:42
 * Description:
 */
@Configuration
public class SelfSupport {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(SelfSupport.class);
        annotationConfigApplicationContext.refresh();
    }
}
