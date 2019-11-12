package com.valor.practice.design;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 13:48
 * Description:  具体享元角色
 */
public class ConCreateBook extends Book{

    public ConCreateBook(String code) {
        super(code);
    }
    //根据外部状态进行业务逻辑
    @Override
    public void operate() {
        System.out.println("业务逻辑:"+code);
    }
}
