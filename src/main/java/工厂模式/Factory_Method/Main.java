package 工厂模式.Factory_Method;

/**
 * 工厂方法模式，满足了开闭原则，但是增加了系统的复杂度
 */
public class Main {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeShop coffeeShop=new CoffeeShop();
        //创建对象
        AmericanoCoffeeFactory americanoCoffeeFactory = new AmericanoCoffeeFactory();

        LatteCoffeeFactory latteCoffeeFactory=new LatteCoffeeFactory();
        coffeeShop.setCreatCoffee(latteCoffeeFactory);

        Coffee coffee = coffeeShop.buyCoffee();
        coffee.getName();
    }
}
