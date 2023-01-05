package Factory_pattern.Factory_Method;

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee buyCoffee() {
        return new Latte();
    }
}
