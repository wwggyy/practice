package com.valor.practice.producter;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-27 22:30
 **/
public class Consumer implements Runnable{
    private final Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e ){
                e.printStackTrace();
            }
            resource.get();
        }
    }
}
