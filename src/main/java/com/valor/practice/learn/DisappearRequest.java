package com.valor.practice.learn;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-04-05 23:45
 **/
public class DisappearRequest {
    public static void main(String[] args) {
        int a = 0;
        ObjectLock instance = new ObjectLock(a);
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()){

        }
        System.out.println("finished, a= "+ instance.getA());
    }
}

class ObjectLock implements Runnable {

    private int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    ObjectLock(int a){
        this.a = a;
    }
    @Override
    public void run() {
        synchronized(this){
            System.out.println("我是对象锁的块形式:" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 1000; i++) {
                a++;
            }
            System.out.println(Thread.currentThread().getName() + " 运行结束");
        }
    }
}