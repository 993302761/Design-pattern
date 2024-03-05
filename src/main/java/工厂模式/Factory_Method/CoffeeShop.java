package 工厂模式.Factory_Method;

/**
 * 咖啡店类
 */
public class CoffeeShop {

    private CoffeeFactory coffeeFactory;

    public void setCreatCoffee(CoffeeFactory creatCoffee) {
        this.coffeeFactory = creatCoffee;
    }

    public Coffee buyCoffee(){
        Coffee coffee = coffeeFactory.buyCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
