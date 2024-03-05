package 代理模式.JDK_dynamic_proxy;


/**
 *  JDK动态代理
 *  JDK1.8时，JDK代理效率高于CGLIB代理，所以有接口时使用JDK，没有时使用CGLIB
 *  和静态代理比较，最大的好处是接口中声明的所有方法都被转移到调用处理器一个集中的方法中处理，不需要像静态代理那样每个方法进行中转
 *
 *  在目标对象和客户端之间起到一个中介作用，在一定程度上降低了耦合度
 *  使用场景：远程代理（RPC），防火墙代理，保护代理
 */
public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory=new ProxyFactory();
        TicketSelling proxy = proxyFactory.getProxy();
        proxy.sell();
    }
}
