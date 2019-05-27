package com.valor.practice.learn.lock;

import java.util.Random;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 23:50
 **/
public class Producer implements Runnable{
    private final LockResource lr;

    public Producer(LockResource lr) {
        this.lr = lr;
    }

    @Override
    public void run() {
        while (true){
            Random random = new Random();
            int ProdRandom=random.nextInt(10);
            lr.add(ProdRandom);
        }

    }
}
