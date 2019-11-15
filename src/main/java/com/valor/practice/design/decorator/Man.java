package com.valor.practice.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/15 13:52
 * Description: 需要装饰的对象
 */
@Slf4j
public class Man extends Person{
    @Override
    public void eat() {
        log.info("{},吃点东西吧",Man.class.getSimpleName());
    }
}
