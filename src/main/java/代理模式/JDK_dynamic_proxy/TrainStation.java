package 代理模式.JDK_dynamic_proxy;

public class TrainStation implements TicketSelling {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }

    @Override
    public void show(String s) {
        System.out.println(s+"查看火车票");
    }
}
