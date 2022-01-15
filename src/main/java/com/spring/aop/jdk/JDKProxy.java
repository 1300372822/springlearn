package com.spring.aop.jdk;

import com.spring.aop.CalcService;
import com.spring.aop.CalcServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现代理类对象
        Class[] interfaces = {CalcService.class};
        CalcService calcService = new CalcServiceImpl();
        CalcService o = (CalcService) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,
                new CalserviceProxy(calcService));
        int div = o.div(1, 2);
        System.out.println(div);

    }
}

class CalserviceProxy implements InvocationHandler {

    //1.把创建的是谁的代理对象，把谁传递过来
    //通过构造函数传
    private Object object;
    public CalserviceProxy(Object object) {
        this.object = object;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行---------------"+method.getName()+" :传递的参数... "+ Arrays.toString(args));
        //被增强的方法执行
        Object invoke = method.invoke(object, args);
        //方法之后
        System.out.println("方法之后执行。。。。。。。 " +object);
        return invoke;
    }
}
