package com.valor.practice.design;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:20
 * Description:
 */
public class DepartmentHead extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request == 4){
            System.out.println("系主任处理!");
        }else {
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else {
                System.out.println("责任链处理结束");
            }
        }
    }
}
