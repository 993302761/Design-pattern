package 工厂模式.Simple_Factory;

/**
 * 简单工厂与具体类产生了新的耦合
 * (静态工厂)违背了开闭原则
 */
public class SimpleCoffeeFactory {

    public static Coffee creatCoffee(String type){
        if(type.equals("Americano")){
            return new Americano();
        }else if (type.equals("Latte")){
            return new Latte();
        }else {
            System.out.println("无此类咖啡");
            return null;
        }
    }
}
