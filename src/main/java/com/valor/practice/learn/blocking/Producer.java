package com.valor.practice.learn.blocking;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 23:36
 **/
@Slf4j
public class Producer implements Runnable{
    private final BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            Random random = new Random();
            int ProdRandom=random.nextInt(10);
            log.info("Producer: {}",ProdRandom);
            queue.put(ProdRandom);
        }catch (InterruptedException e){
            log.info("生产异常");
        }
    }
}
