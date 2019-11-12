package com.valor.practice.learn.loader;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-06-04 17:41
 **/
@Slf4j
public class LoaderDemo {
    public static void main(String[] args) {
        try {
            loadClass();
            loadParentClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void loadClass() throws ClassNotFoundException{
        Class clazz = Class.forName("com.valor.practice.learn.loader.Order");
        ClassLoader loader = clazz.getClassLoader();
        log.info("My class loader: {}",loader.getClass().getSimpleName());
    }
    private static void loadParentClass() throws ClassNotFoundException{
        Class clazz = Class.forName("com.valor.practice.learn.loader.Order");
        ClassLoader classLoader = clazz.getClassLoader();
        while(classLoader.getParent()!=null){
            classLoader = classLoader.getParent();
            log.info("Parent Class loader: {}",classLoader.getClass().getSimpleName());
        }
    }
}
