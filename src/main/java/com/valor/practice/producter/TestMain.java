package com.valor.practice.producter;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 22:31
 **/
public class TestMain {

    public static void main(String[] args) {
        Resource resource = new Resource();
        Producer p = new Producer(resource);
        Consumer c = new Consumer(resource);

        Thread t0 = new Thread(p);
        Thread t1 = new Thread(c);

        t0.start();
        t1.start();
    }
}
