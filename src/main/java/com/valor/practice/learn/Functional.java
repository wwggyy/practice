package com.valor.practice.learn;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/5/28 15:37
 * Description:
 */
@FunctionalInterface
public interface Functional {
    void method();
//    void method1(String b);
    //默认方法和静态方法不会破坏函数式接口的定义
    default void defaultMethod(){

    }
}
