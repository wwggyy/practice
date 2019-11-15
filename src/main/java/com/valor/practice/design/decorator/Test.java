package com.valor.practice.design.decorator;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/15 14:05
 * Description:
 */
public class Test {

    public static void main(String[] args) {
        Man man = new Man();
        ExpensiveFood food = new ExpensiveFood(man);
        food.eat();
        CheapFood cheapFood = new CheapFood(man);
        cheapFood.eat();
    }
}
