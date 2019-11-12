package com.valor.practice.design;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:17
 * Description:
 */
public class ClassAdviser extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request == 1){
            System.out.println("班主任处理!");
        }else {
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else {
                System.out.println("责任链处理结束");
            }
        }
    }
}
