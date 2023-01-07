package Proxy_pattern.JDK_dynamic_proxy;


/**
 *  JDK动态代理
 */
public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory=new ProxyFactory();
        TicketSelling proxy = proxyFactory.getProxy();
        proxy.sell();


        System.out.println(proxy.getClass());
    }
}
