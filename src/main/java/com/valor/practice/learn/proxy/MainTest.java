package com.valor.practice.learn.proxy;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-06-01 21:21
 **/
public class MainTest {
    public static void main(String[] args) {
        IUserDao obj= new UserDao();

        ProxyFactory factory = new ProxyFactory(obj);
        IUserDao proxy = (IUserDao)factory.getProxyInstance();
        proxy.save();
        proxy.find();
    }
}
