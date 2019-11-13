package com.valor.practice.design.staticfactory;

import lombok.Data;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/10/10 15:57
 * Description:  静态工厂模式
 */
@Data
public class User {
    private String name;
    private String phone;
    private String email;
    public User(){
        super();
    }
    public User(String name){
        this.name = name;
    }
    public enum Type{
        ADMIN,
        CUSTOMER;
    }
    public static User newInstance(String name, Type type, String id){
        if(type.equals(Type.ADMIN)){
            return new Consumer(name, id);
        }else if(type.equals(Type.CUSTOMER)){
            return new Admin(name, id);
        }
        return new User(name);
    }

    public static User newAdminInstance(String name, String email){
        return new Admin(name, email);
    }
    public static User newConsumerInstance(String name, String phone){
        return new Consumer(name, phone);
    }
}
