package com.we.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author BigRedCaps
 * @date 2021/5/4 10:32
 */
public class RentServiceProxy implements InvocationHandler{
    /**
     * 真实的服务对象（被代理）
     */
    private Object target;

    /**
     * 绑定一个委托对象并返回一个代理类
     * @param target
     * @return
     */
    public Object getProxy(Object target){
        this.target = target;
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
        return proxy;
    }

    /**
     * 通过代理对象调用方法首先进入这个方法
     * @param proxy 代理对象
     * @param method 被调用方法
     * @param arg 方法参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] arg) throws Throwable {
        Object result = null;
        //反射方法调用前
        System.out.println("中介：这个是房子[" + arg[0] + "]的照片");
        //执行方法，相当于调用HelloServiceImpl的sayHello方法
        result = method.invoke(target, arg);
        //反射方法调用后
        System.out.println("中介：带领验房[" + arg[0] + "]，交尾款和押金，交钥匙");
        return result;
    }
}
