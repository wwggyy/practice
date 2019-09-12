package com.valor.practice.learn;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/5/28 15:54
 * Description: 默认方法
 */
public interface Defaulable {
    default String notRequired() {
        return "Default implementation";
    }
}
