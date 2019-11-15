package com.valor.practice.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/15 13:58
 * Description: 具体装饰类
 */
@Slf4j
public class ExpensiveFood extends PersonFood{
    public ExpensiveFood(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        super.eat();
        eatSteak();
        drinkRedWine();
    }

    private void eatSteak(){
        log.info("{},吃牛排",ExpensiveFood.class.getSimpleName());
    }

    private void drinkRedWine(){
        log.info("{},喝拉菲",ExpensiveFood.class.getSimpleName());
    }
}
