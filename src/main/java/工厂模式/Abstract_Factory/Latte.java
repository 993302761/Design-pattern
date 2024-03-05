package 工厂模式.Abstract_Factory;

/**
 * 具体产品
 */
public class Latte extends Coffee {
    @Override
    public void getName() {
        System.out.println("拿铁咖啡");
    }
}
