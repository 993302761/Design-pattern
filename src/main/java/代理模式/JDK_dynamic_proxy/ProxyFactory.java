package 代理模式.JDK_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类，不是代理类
 */
public class ProxyFactory   {

    private TrainStation trainStation=new TrainStation();


    //获取代理对象
    public TicketSelling getProxy(){
        /*  newProxyInstance()
                (ClassLoader loader,    类加载器，可以加载代理类，可以通过目标对象获取类加载器
                Class<?>[] interfaces,  代理类实现的接口的字节码对象
                InvocationHandler h)    代理对象的调用处理程序

                Proxy.newProxyInstance返回的相当于该接口的子实现类
         */
        TicketSelling ticketSelling= (TicketSelling) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                //获得trainStation对象所实现的第一个接口
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override

                    //Object proxy,     代理对象，就是ticketSelling
                    // Method method,   对接口中的方法进行封装的对象
                    // Object[] args    调用方法的实际参数
                    //返回值即为方法的返回值
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收取手续费");
                        //目标执行的方法名
                        System.out.println(method.getName());
                        //目标执行方法的参数
                        if (args!=null){
                            for (Object o :
                                    args) {
                                System.out.println(o);
                            }
                        }
                        //执行目标对象的方法
                        Object invoke = method.invoke(trainStation, args);
                        return invoke;
                    }
                });
        return ticketSelling;
    }

}
