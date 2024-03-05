package 外观模式;

/**
 * 外观模式（门面模式）
 * 是迪米特法则的典型应用
 *
 * 降低了子系统和客户端之间的耦合度，对客户屏蔽了子系统组件，减少了客户处理对象的数目
 *
 * 不符合开闭原则
 *
 */
public class Main {
    public static void main(String[] args) {
        SmartAPP smartAPP=new SmartAPP();
        smartAPP.on();
        smartAPP.off();
    }
}
