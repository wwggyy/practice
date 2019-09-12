package com.valor.practice.learn;

import java.util.function.Supplier;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/5/28 17:04
 * Description:
 */
public class Car {
    public static Car create( final Supplier< Car > supplier ) {
        return supplier.get();
    }

    public static void collide( final Studuent studuent ) {
        System.out.println( "Collided " + studuent.getName() );
    }

    public void follow( final Car another ) {
        System.out.println( "Following the " + another.toString() );
    }

    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }
}
