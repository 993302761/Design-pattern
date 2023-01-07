package Factory_pattern.Abstract_Factory;

public class ItalianFactory implements DessertFactory {
    @Override
    public Coffee buyCoffee() {
        return new Latte();
    }

    @Override
    public Dessert buyDessert() {
        return new Tiramis();
    }
}
