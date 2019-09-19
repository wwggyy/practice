package com.valor.practice.learn.Generics;

import lombok.Data;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/9/17 15:54
 * Description:
 */
@Data
public class Animal<T> {
    private int age;
    private T name;

    public static <E> void see(E a){
        System.out.println("SimpleName=="+a.getClass().getSimpleName()+" &TypeName=="+a.getClass().getTypeName());
    }
}
