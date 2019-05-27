package com.valor.practice.learn.lock;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 23:45
 **/
@Slf4j
public class LockResource {
    int max = 5;
    LinkedList<Integer> ProdLine = new LinkedList<Integer>();
    Lock lock = new ReentrantLock();
    Condition full = lock.newCondition();
    Condition empty = lock.newCondition();
    public void add(int ran){
        try {
            lock.lock();
            while(max == ProdLine.size()){
                log.info("存储量达到上限，请等待");
                full.await();
            }
            ProdLine.add(ran);
            log.info("生产:{}",ran);
            empty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

    public void get() {
        try {
            lock.lock();
            while(ProdLine.size() == 0){
                log.info("队列是空的，请稍候");
                empty.await();
            }
            log.info("消费：{}",ProdLine.removeFirst());
            full.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();

        }
    }
}

