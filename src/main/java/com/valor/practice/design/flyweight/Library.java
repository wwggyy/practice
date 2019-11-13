package com.valor.practice.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 13:49
 * Description: 享元工厂
 */
public class Library {

    private static Map<String, Book> pool = new HashMap<>(1<<4);

    public static Book getBook(String code){
        Book book = null;
        if(pool.containsKey(code)){
            book = pool.get(code);
            System.out.println("已有:"+code+",从池中取出...");
        }else {
            book = new ConCreateBook(code);
            pool.put(code,book);
            System.out.println("创建:"+code+",并从池中取出");
        }
        return book;
    }

}
