package com.valor.practice.learn.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description
 * @Author valor.wang
 * Date  2019-06-01 20:54
 **/
@Slf4j
public class UserDao implements IUserDao{
    @Override
    public void save() {
        log.info("from {} - {}","UserDao","save");
    }

    @Override
    public void find() {
        log.info("from {} - {}","UserDao","find");
    }
}
