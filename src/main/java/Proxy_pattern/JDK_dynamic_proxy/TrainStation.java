package Proxy_pattern.JDK_dynamic_proxy;

public class TrainStation implements TicketSelling {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
