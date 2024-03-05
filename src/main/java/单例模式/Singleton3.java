package 单例模式;

/**
 * Singleton_pattern.Singleton（单例）
 * 懒汉式单例（在首次使用时创建）
 */
public class Singleton3 {


    //1.私有构造方法
    private Singleton3(){}

    //2.在本类中创建该类对象
    private static Singleton3 s;

    //3.提供一个公共的访问方法，让外界可以获取该对象，synchronized保证线程安全
    //对newSingleton()方法来说，绝大部分都是读操作，读操作的线程是安全的，没必要让每个线程必须持有锁才能调用该方法，在Singleton4中优化
    public static synchronized Singleton3 newSingleton(){
        if (s==null){
            s=new Singleton3();
        }
        return s;
    }
}
