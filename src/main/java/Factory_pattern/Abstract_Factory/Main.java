package Factory_pattern.Abstract_Factory;

/**
 * 工厂方法模式，满足了开闭原则，如果要加同一个产品族的话，只需要再加一个对应的工厂即可
 * 但当产品族中需要增加一个新产品，则所有的工厂类都要修改
 * Collection（抽象工厂类）和ArrayList（具体工厂类）使用的就是工厂方法模式，Iterator（抽象产品类）
 */
public class Main {
    public static void main(String[] args) {
        //创建意式工厂对象
        ItalianFactory italianFactory=new ItalianFactory();

        Coffee coffee = italianFactory.buyCoffee();
        coffee.getName();
        coffee.addMilk();

        Dessert dessert = italianFactory.buyDessert();
        dessert.show();
    }
}
