package Factory_pattern.Factory_Method;


/**
 * 具体产品
 */
public class Americano extends Coffee {
    @Override
    public void getName() {
        System.out.println("美式咖啡");
    }
}
