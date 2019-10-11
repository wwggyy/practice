package com.valor.practice.design;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/10/10 16:00
 * Description:
 */
public class Admin extends User{
    public Admin(String name, String email) {
       super(name);
       this.setEmail(email);
    }
}
