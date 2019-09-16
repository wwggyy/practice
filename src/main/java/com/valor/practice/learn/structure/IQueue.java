package com.valor.practice.learn.structure;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/9/12 16:00
 * Description:
 */
public interface IQueue<E> {
    boolean insert(E e) throws Exception;

    E remove() throws Exception;

    E peek() throws Exception;
}
