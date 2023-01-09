package Strategy_pattern;

/**
 * 策略模式
 * 策略类之间可以自由切换，符合开闭原则，可以隐藏算法的细节
 * 但客户部必须知道所有的策略类，并自行决定使用哪种策略类
 * 可以配合享元模式减少策略类对象
 * 可以使用策略模式来移除程序中的if else
 *
 * Arrays中的sort方法（排序）使用的便是策略模式
 * 线程池的拒绝策略也是策略模式
 */
public class Main {
    public static void main(String[] args) {
        SalesMan salesMan=new SalesMan(new StrategyB());
        salesMan.SalesManShow();
    }
}
