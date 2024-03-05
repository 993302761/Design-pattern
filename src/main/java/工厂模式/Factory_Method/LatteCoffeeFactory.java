package 工厂模式.Factory_Method;

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee buyCoffee() {
        return new Latte();
    }
}
