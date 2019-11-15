package com.valor.practice.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/15 13:54
 * Description:
 */
@Slf4j
public class WoMan extends Person{
    @Override
    public void eat() {
      log.info("{},美美的吃点东西",WoMan.class.getSimpleName());
    }
}
