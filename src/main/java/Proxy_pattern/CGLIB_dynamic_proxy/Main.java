package Proxy_pattern.CGLIB_dynamic_proxy;


/**
 *  CGLIB动态代理
 *  底层使用ASM字节码生成框架，在java1.6之前比java反射效率高
 */
public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory=new ProxyFactory();
        //获取代理对象
        TrainStation proxy = proxyFactory.getProxy();
        proxy.sell();
    }
}
