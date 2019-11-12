package com.valor.practice.design;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:49
 * Description:
 */
public class Plugin {
//    private Object target;
//    private Interceptor interceptor;
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//        if (满足代理条件) {
//            return interceptor.intercept(new Invocation(target, method, args));
//        }
//        return method.invoke(target, args);     
//    }
//
//    public static Object wrap(Object target, Interceptor interceptor) {
//        Class<?> type = target.getClass();
//        Class<?>[] interfaces = getAllInterfaces(type, signatureMap);
//        if (interfaces.length > 0) {
//            return Proxy.newProxyInstance(
//                                        type.getClassLoader(),
//                                        interfaces,
//                                        new Plugin(target, interceptor, signatureMap));
//        }
//        return target;
//    }
}
