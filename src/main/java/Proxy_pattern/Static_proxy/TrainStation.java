package Proxy_pattern.Static_proxy;

public class TrainStation implements TicketSelling{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
