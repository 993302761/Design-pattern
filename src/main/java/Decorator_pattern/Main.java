package Decorator_pattern;

/**
 *
 * 装饰者模式可以带来比继承更灵活的扩展功能，继承是静态的附加责任，装饰者是动态的附加责任
 * 装饰者类和被装饰类可以独立发展，不会相互耦合
 *
 * 使用场景：
 * 1.当不能采用继承的方式对系统进行扩充或者采用继承不利于维护系统时
 * 如：系统中存在大量的扩展或者一个类不能被继承（final）
 * 2.在不影响其他对象的情况下，为单个对象添加职责
 * 3.当对象的功能要求可以动态添加或者动态撤销时
 *
 * 代理和装饰者的区别：
 * 装饰者是为了增强对象，静态代理是为了保护和隐藏对象
 * 装饰者的目标对象由外界传递进来，可以通过构造方法传递
 * 静态代理是在代理类内部创建，以此来隐藏目标
 */
public class Main {
    public static void main(String[] args) {
        FastFood egg=new Egg(new FriedNoodles());

        System.out.println(egg.cost()+egg.getDesc());
    }
}
