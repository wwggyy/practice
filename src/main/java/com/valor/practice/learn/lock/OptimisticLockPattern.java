package com.valor.practice.learn.lock;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 23:44
 **/
public class OptimisticLockPattern {
    public static void main(String[] args) {

        LockResource lr = new LockResource();

        Thread t0 = new Thread(new Producer(lr));
        Thread t1 = new Thread(new Consumer(lr));

        t0.start();
        t1.start();
    }
}
