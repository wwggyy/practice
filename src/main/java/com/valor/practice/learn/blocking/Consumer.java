package com.valor.practice.learn.blocking;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 23:28
 **/
@Slf4j
public class Consumer implements Runnable{
    private final BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                log.info("Consumer: {}",this.queue.take());
            }catch (InterruptedException e){
                log.error("消费线程异常");
            }
        }
    }
}
