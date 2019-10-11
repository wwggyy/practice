package com.valor.practice.learn.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

/**
 * @Description JDK动态代理
 *      给多个目标对象生成代理对象
 *      使用JDK生成的动态代理必须有实现的接口，
 *      如果某个类未实现接口，就不能使用jdk动态代理。
 *      CGLIB 是以动态生成的子类继承目标的方式实现，在运行期动态的在内存中构建一个子类。
 *      CGLIB 使用的前提是目标类不能为 final 修饰。因为 final 修饰的类不能被继承。
 * @Author valor.wang
 * Date  2019-06-01 21:04
 **/
@Slf4j
public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxyInstance() {
      return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), (pro, method, args)->{
                        String methodName = method.getName();
                        if("find".equals(methodName)){
                            System.out.println("ProxyFactory  find");
                        }else {
                            System.out.println("ProxyFactory  save");
                        }
                        return method.invoke(target,args);
                });
    }
}
