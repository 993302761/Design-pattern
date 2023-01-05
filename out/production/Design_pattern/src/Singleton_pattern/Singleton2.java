package Singleton_pattern;

/**
 * Singleton_pattern.Singleton（单例）
 * 饿汉式单例（不管有没有需要，在类加载的时候实例化自己）
 * 以静态成员代码块方式创建
 */
public class Singleton2 {


    //1.私有构造方法
    private Singleton2(){}

    //2.在本类中创建该类对象
    private static Singleton2 s;

    //3.在静态代码块中赋值
    static {
        s=new Singleton2();
    }

    //4.提供一个公共的访问方法，让外界可以获取该对象
    public static Singleton2 newSingleton(){
        return s;
    }
}
