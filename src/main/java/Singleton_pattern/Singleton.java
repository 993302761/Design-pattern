package Singleton_pattern;

import java.io.Serializable;

/**
 * Singleton_pattern.Singleton（单例）
 * 饿汉式单例（不管有没有需要，在类加载的时候实例化自己）
 * 以静态成员变量方式创建
 */

//Serializable为序列化接口，在Main中测试破坏单例
public class Singleton implements Serializable {


    //1.私有构造方法
    private Singleton(){
        /**
         * 解决反射破坏单例
         */
        if (s!=null){
            throw new RuntimeException("不能创建多个单例对象");
        }
    }

    //2.在本类中创建该类对象
    private static Singleton s=new Singleton();

    //3.提供一个公共的访问方法，让外界可以获取该对象
    public static Singleton newSingleton(){
        return s;
    }


    //用于解决序列化破坏单例的情况
    public Object readResolve(){
        return s;
    }

}
