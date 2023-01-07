package Factory_pattern.Abstract_Factory;


/**
 * 抽象工厂
 */
public interface DessertFactory {

    //买咖啡
    Coffee buyCoffee();


    //买甜品
    Dessert buyDessert();

}
