package 工厂模式.Simple_Factory;

/**
 * 咖啡类（抽象产品）
 */
public abstract class Coffee {

    public abstract void getName();

    public void addSugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加奶");
    }
}
