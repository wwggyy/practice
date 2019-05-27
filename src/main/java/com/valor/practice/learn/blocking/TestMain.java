package com.valor.practice.learn.blocking;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 23:40
 **/
public class TestMain {
    public static void main(String[] args) {
        BlockingQueue sharedQueue = new LinkedBlockingQueue();
        //创建生产者线程和消费者线程
        Thread prodThread = new Thread(new Producer(sharedQueue));
        Thread consThread = new Thread(new Consumer(sharedQueue));

        //启动生产者线程和消费者线程
        prodThread.start();
        consThread.start();
    }
}
