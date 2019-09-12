package com.valor.practice.learn;

import lombok.Data;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/5/28 18:08
 * Description:
 */
@Data
public class Studuent {
    private int age;
    private String name;
    public Studuent(String name,int age){
        this.name = name;
        this.age = age;
    }
}
