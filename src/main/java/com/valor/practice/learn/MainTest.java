package com.valor.practice.learn;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-05-26 20:16
 **/
public class MainTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            System.out.println("I am try");
            i =2;
            return;
        }catch (Exception e){

        }finally {
            i=4;
            System.out.println("finally,i="+i);
        }
    }
}
