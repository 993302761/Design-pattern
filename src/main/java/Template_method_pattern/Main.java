package Template_method_pattern;

/**
 * 模板方法模式
 * 将相同的方法放在了抽象父类中，而将可能不同的代码放在了子类
 * 实现了反向控制
 *
 * 使用场景：算法的整体步骤很固定，但其中个别部分易变时，可以使用
 * 需要通过子类决定父类算法的某个步骤是否执行的时候
 */
public class Main {
    public static void main(String[] args) {
        ConcreteClass concreteClass=new ConcreteClass();
        concreteClass.cookProcess();
        System.out.println("-----------------------");
        ConcreteClass2 concreteClass2=new ConcreteClass2();
        concreteClass2.cookProcess();
    }
}
