package com.valor.practice.design.flyweight;

import lombok.Data;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 10:23
 * Description:  抽象享元角色
 */
@Data
public abstract  class Book {
    //内部状态:书名
    private String name;

    public final String code;
    //要求享元角色必须接受外部状态
    public Book(String code){
        this.code = code;
    }

    public abstract void operate();
}
