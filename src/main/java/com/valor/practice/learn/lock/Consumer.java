package com.valor.practice.learn.lock;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 23:52
 **/
public class Consumer implements Runnable{

    private final LockResource lr;

    public Consumer(LockResource lr) {
        this.lr = lr;
    }

    public void run() {
        while(true) {
          lr.get();
        }
    }

}
