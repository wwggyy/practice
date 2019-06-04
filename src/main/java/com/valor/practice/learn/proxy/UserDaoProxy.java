package com.valor.practice.learn.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Description 静态代理
 *        1. 目标对象必须要实现接口
 *        2. 代理对象 要实现与目标对象一样的接口
 * @Author valor.wang
 * Date  2019-06-01 21:00
 **/
@Slf4j
public class UserDaoProxy implements IUserDao{

    private IUserDao target = new UserDao();

    @Override
    public void save() {
        log.info("代理操作：开始...");
        target.save();
        log.info("代理操作：结束...");
    }

    @Override
    public void find() {
        log.info("代理操作：开始...");
        target.find();
        log.info("代理操作：结束...");
    }
}
