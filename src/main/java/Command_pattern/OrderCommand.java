package Command_pattern;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.HashMap;
import java.util.Set;

/**
 * 具体命令类
 */
public class OrderCommand implements Command{

    private Cook cook;

    private Order order;

    public OrderCommand(Cook cook, Order order) {
        this.cook = cook;
        this.order = order;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getTableNo()+"桌的订单：");
        HashMap<String, Integer> hashMap = order.getHashMap();

        //遍历hashmap
        Set<String> strings = hashMap.keySet();
        for (String foodName :
                strings) {
            cook.makeFood(foodName,hashMap.get(foodName));
        }

        System.out.println("准备完毕\n");
    }
}
