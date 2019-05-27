package com.valor.practice.producter;

import lombok.extern.slf4j.Slf4j;


/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 21:58
 **/
@Slf4j
public class Resource {
    private int count=0;

    public synchronized void set(){

        while (count==5){
            try{
                log.info("资源池已满");
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notify();
        count++;
        log.info("生产成功----{}",count);
    }
    public synchronized void get() {
        while (count==0){
            try{
                log.info("资源池已空");
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        count--;
        log.info("消费成功----{}",count);
        this.notify();
    }
}
