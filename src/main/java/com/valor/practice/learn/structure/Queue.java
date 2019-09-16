package com.valor.practice.learn.structure;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/9/11 11:13
 * Description:  循环队列
 */
public class Queue<E> implements IQueue{

    private Object [] queArray;
    private int maxSize;
    private int front;   //存储队头元素的下标
    private int rear;    //存储队尾元素的下标
    private int length; //队列长度

    //构造方法，初始化队列
    public Queue(int maxSize){
        this.maxSize = maxSize;
        queArray = new Object [maxSize];
        front = 0;
        rear = -1;
        length = 0;
    }

    //插入
    @Override
    public boolean insert(Object o) throws Exception{
        if(isFull()){
            throw new Exception("队列已满，不能进行插入操作！");
        }
        //如果队尾指针已到达数组的末端，插入到数组的第一个位置
        if(rear == maxSize-1){
            rear = -1;
        }
        queArray[++rear] = o;
        length++;
        return true;
    }


    //移除
    public E remove() throws Exception{
        if(isEmpty()){
            throw new Exception("队列为空，不能进行移除操作！");
        }
        E elem = (E)queArray[front++];
        //如果队头指针已到达数组末端，则移到数组第一个位置
        if(front == maxSize){
            front = 0;
        }
        length--;
        return elem;
    }

    //查看队头元素
    public E peek() throws Exception{
        if(isEmpty()){
            throw new Exception("队列内没有元素！");
        }
        return (E)queArray[front];
    }

    //获取队列长度
    public int size(){
        return length;
    }

    //判空
    public boolean isEmpty(){
        return (length == 0);
    }

    //判满
    public boolean isFull(){
        return (length == maxSize);
    }

}
