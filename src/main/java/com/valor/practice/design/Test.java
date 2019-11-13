package com.valor.practice.design;

import org.springframework.util.StringUtils;

import java.io.File;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/10/10 16:12
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        //构造器模式
//         People people = new People.Builder().name("name").age(5).build();
//         People people1 = new People.Builder().name("name").email("1@126.com").build();

        //享元模式
        //享元模式的优点和缺点:
        //享元模式是一个非常简单的模式, 它可以大大减少应用程序创建的对象,减低程序内存的占用,增强程序的性能,
        // 但它同时也提高了系统复杂性,需要分离出外部状态和内部状态, 而且外部状态具有固化特性,不应该随内部状态改变而改变,否则导致系统的逻辑混乱
        //享元模式的使用场景:
        //系统中存在大量的相似对象
        //细粒度的对象都具备较接近的外部状态,而且内部状态与环境无关,也就是说对象没有特定身份
        //需要缓冲池的场景
//        Book b1 = Library.getBook("ISBN 11-11");
//        b1.operate();
//        Book b2 = Library.getBook("ISBN 11-12");
//        b2.operate();
//        Book b3 = Library.getBook("ISBN 11-11");
//        b3.operate();


//        String str = "C://d"+ File.separator+"p";
//        System.out.println(str);
//        long inputFileTotalSpace=9080000;
//        long outFileTotalSpace =7080000;
//
//        DecimalFormat df=new DecimalFormat("0.000000");//设置保留位数
//        String s =  df.format((float)outFileTotalSpace/inputFileTotalSpace);
//
//        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
//        String issueUrl = "http://10.202.7.187:8088/browse/ITAO_TCMP_CORE-23";
//        List<User> list = new ArrayList<User>(1<<2);
//        list.add(User.newConsumerInstance("a","b"));
//        System.out.println(list.toString());
//        System.out.println(issueUrl.substring(issueUrl.lastIndexOf('/')+1));
    }
}
