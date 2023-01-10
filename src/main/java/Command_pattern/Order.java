package Command_pattern;

import Strategy_pattern.Strategy;

import java.util.HashMap;


/**
 * 订单类
 */
public class Order {
    //桌号
    private int tableNo;
    //菜品
    private HashMap<String,Integer> hashMap=new HashMap<>();

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }


    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public void setFood(String name, Integer num) {
        //菜名和份数
        this.hashMap.put(name,num);
    }
}
