package 工厂模式.Config_Factory;

/**
 * 简单工厂模式+配置文件
 */
public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop=new CoffeeShop();
        Coffee latte = coffeeShop.buyCoffee("Americano");
        latte.addMilk();
        latte.getName();

    }
}
