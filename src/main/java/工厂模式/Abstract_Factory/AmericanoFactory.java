package 工厂模式.Abstract_Factory;

/**
 * 具体工厂
 */
public class AmericanoFactory implements DessertFactory {
    @Override
    public Coffee buyCoffee() {
        return new Americano();
    }

    @Override
    public Dessert buyDessert() {
        return new Mousse();
    }
}
