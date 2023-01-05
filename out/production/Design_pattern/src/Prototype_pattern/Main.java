package Prototype_pattern;


/**
 * 原型模式，分为浅克隆和深克隆
 * 浅克隆：创建一个新对象，新对象的属性和原对象的相同，对于非基本类属性，仍指向原有属性所指向的对象的地址
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址
 *
 * java中Object类提供了浅克隆
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆
//        Prototype p=new Prototype();
//        p.setData("111");
//        Prototype clone = p.clone();
//        System.out.println(p.getData());
//        System.out.println(clone.getData());

        //深克隆
        Prototype p=new Prototype();
        Data d=new Data();
        p.setData(d);
        p.set1("11");
        Prototype clone = p.clone();
        clone.set1("222");
        //p和clone的data是同一个对象
        System.out.println(p.getData().getData());
        System.out.println(clone.getData().getData());
    }
}
