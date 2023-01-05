package Factory_pattern.Config_Factory;


/**
 * 具体产品
 */
public class Americano extends Coffee {
    @Override
    public void getName() {
        System.out.println("美式咖啡");
    }
}
