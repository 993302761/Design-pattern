package Factory_pattern.Simple_Factory;

/**
 * 简单工厂模式更像是一种编程规范
 */
public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop=new CoffeeShop();
        Coffee latte = coffeeShop.buyCoffee("Latte");
        latte.getName();
    }
}
