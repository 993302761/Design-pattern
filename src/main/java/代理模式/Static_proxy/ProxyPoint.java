package 代理模式.Static_proxy;

/**
 * 代售点类
 * 代售点类作为访问对象和目标对象的中介,同时对sell方法进行增强
 */
public class ProxyPoint implements TicketSelling{

    //火车站类可套用单例
    private TrainStation trainStation=new TrainStation();

    @Override
    public void sell() {
        System.out.println("代收服务费用");
        trainStation.sell();
    }
}
