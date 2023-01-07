package Proxy_pattern.CGLIB_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类，不是代理类
 */
public class ProxyFactory   implements MethodInterceptor {

    private TrainStation station=new TrainStation();

    //获取代理对象
    public TrainStation getProxy(){
        //相当于JDK动态代理中的proxy类
        Enhancer enhancer=new Enhancer();

        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);

        //设置回调函数
        enhancer.setCallback(this);

        //创建代理对象
        TrainStation trainStation= (TrainStation) enhancer.create();
        return trainStation;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取手续费");
        //调用目标对象的方法
        Object invoke = method.invoke(station, objects);
        return invoke;
    }
}
