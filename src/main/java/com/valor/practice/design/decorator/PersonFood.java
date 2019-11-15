package com.valor.practice.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/15 13:55
 * Description:  装饰者抽象类
 */
@Slf4j
public abstract class PersonFood extends Person{
    private Person person;

    public PersonFood(Person person) {
        this.person = person;
    }
    @Override
    public void eat() {
        person.eat();
    }
}
