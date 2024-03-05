package 原型模式.Deep_cloning;


/**
 * 原型模式，分为浅克隆和深克隆
 * 浅克隆：创建一个新对象，新对象的属性和原对象的相同，对于非基本类属性，仍指向原有属性所指向的对象的地址
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址
 *
 * java中Object类提供了浅克隆
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p = new Prototype();
        Data d = new Data();
        p.setData(d);
        p.set1("11");
        //深克隆不通过clone函数进行克隆，而是通过序列化和反序列化的方式创建出一个新的对象（和通过序列化破坏单例相同）

    }


}
