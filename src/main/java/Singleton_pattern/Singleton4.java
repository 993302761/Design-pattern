package Singleton_pattern;

/**
 * Singleton_pattern.Singleton（单例）
 * 懒汉式单例（在首次使用时创建）
 * 双重检查锁方式（DCL）
 */
public class Singleton4 {


    //1.私有构造方法
    private Singleton4(){}

    //2.在本类中创建该类对象
    //在多线程的情况下有可能出现空指针问题，原因是JVM在实例化对象的时候会进行优化的执行重排序,需要volatile来保证可见性和有序性
    //可以保证在多线程的情况下线程安全且不会有性能问题
    private static volatile Singleton4 s;

    //3.提供一个公共的访问方法，让外界可以获取该对象
    public static Singleton4 newSingleton(){
        if (s==null){
            synchronized (Singleton4.class){
                if (s==null){
                    s=new Singleton4();
                }
            }
        }
        return s;
    }
}
