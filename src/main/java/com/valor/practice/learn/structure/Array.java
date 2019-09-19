package com.valor.practice.learn.structure;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/9/11 11:52
 * Description: 其实数组就是一段连续的内存，即使在物理内存中不是连续的，在逻辑上肯定是连续的.
 * 无序数组的优点：插入快，如果知道下标，可以很快的存取O(1)
 * 无序数组的缺点：查找慢，删除慢，大小固定。
 *
 */
public class Array {

    private String [] strArray;
    private int length = 0;       //数组元素个数

    //构造方法，传入数组最大长度
    public Array(int max){
        strArray = new String [max];
    }

    //检测数组是否包含某个元素，如果存在返回其下标，不存在则返回-1
    public int contains(String target){
        int index = -1;
        for(int i=0;i<length;i++){
            if(strArray[i].equals(target)){
                index = i;
                break;
            }
        }
        return index;
    }

    //插入
    public void insert(String elem) {
        strArray[length] = elem;
        length++;
    }

    //删除某个指定的元素值，删除成功则返回true，否则返回false
    public boolean delete(String target){
        int index = -1;
        if((index = contains(target)) !=-1){
            for(int i=index;i<length-1;i++){
                //删除元素之后的所有元素前移一位
                strArray[i] =strArray[i+1];
            }
            length--;
            return true;
        }else{
            return false;
        }
    }

    //列出所有元素
    public void display(){
        for(int i=0;i<length;i++){
            System.out.print(strArray[i]+"\t");
        }
    }

}
