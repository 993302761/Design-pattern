package Factory_pattern.Factory_Method;

/**
 * 具体产品
 */
public class Latte extends Coffee {
    @Override
    public void getName() {
        System.out.println("拿铁咖啡");
    }
}
