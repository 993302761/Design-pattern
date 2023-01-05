package Singleton_pattern;

/**
 * Singleton_pattern.Singleton（单例）
 * 懒汉式单例（在首次使用时创建）
 * 静态内部类
 * （利用JVM在加载外部类的过程中不会加载内部类的特点完成，只有内部类的属性或方法被使用时才会被加载，
 * 静态属性由于被static修饰，保证只被实例化一次，且严格保证实例化顺序，解决指令重排序问题，JVM类加载过程是上锁的，
 * 所以不会有线程安全问题，也不会有性能影响和空间浪费）
 * （开源项目中常用）
 */
public class Singleton5 {

    /**
     * 防止开发人员在不知情的情况下破坏单例
     */
    private static Boolean flag=false;

    //1.私有构造方法
    private Singleton5(){
        synchronized (Singleton5.class){
            //true则为非第一次访问，直接抛出异常
            if (flag==true){
                throw new RuntimeException("不能创建多个单例对象");
            }
            flag=true;
        }
    }

    //2.定义一个内部类
    private static class SingletonHolder{
        //3.在内部类中创建该外部类的对象, final防止通过反射修改
        private final static Singleton5 s=new Singleton5();
    }


    //4.提供一个公共的访问方法，让外界可以获取该对象
    public static Singleton5 newSingleton(){
        return SingletonHolder.s;
    }
}
