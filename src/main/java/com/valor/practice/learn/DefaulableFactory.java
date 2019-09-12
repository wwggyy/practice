package com.valor.practice.learn;

import java.util.function.Supplier;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/5/28 16:44
 * Description:
 */
public interface DefaulableFactory {
    static Defaulable create( Supplier< Defaulable > supplier ) {
        return supplier.get();
    }
}
