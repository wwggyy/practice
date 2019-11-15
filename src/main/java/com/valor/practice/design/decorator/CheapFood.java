package com.valor.practice.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/15 14:03
 * Description:  具体抽象类
 */
@Slf4j
public class CheapFood extends PersonFood{
    public CheapFood(Person person) {
        super(person);
    }
    @Override
    public void eat() {
        super.eat();
        eatNoodles();
    }
    private void eatNoodles(){
       log.info("{},吃面条",this.getClass().getSimpleName());
    }
}
