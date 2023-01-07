package Factory_pattern.Factory_Method;

/**
 * 具体工厂
 */
public class AmericanoCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee buyCoffee() {
        return new Americano();
    }
}
