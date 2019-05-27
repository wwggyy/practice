package com.valor.practice.producter;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 22:28
 **/
public class Producer implements Runnable{
    private final Resource resource;

   public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
       while (true){
           resource.set();
       }

    }
}
