package Factory_pattern.Simple_Factory;

/**
 * 咖啡店类
 */
public class CoffeeShop {

    public Coffee buyCoffee(String type){

        Coffee coffee = SimpleCoffeeFactory.creatCoffee(type);


        if (coffee!=null){
            coffee.addMilk();
            coffee.addSugar();
            coffee.getName();
            return coffee;
        }
        return null;
    }
}
