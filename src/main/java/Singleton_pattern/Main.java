package Singleton_pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 破坏单例（反射和序列化）
 * 在JDK中，Runtime就是使用的单例饿汉模式
 */
public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * 使用序列化的方式破坏单例，因为反序列化创建对象是通过反射创建的，序列化是进行深拷贝
         * 由于是读取路径，通过反序列化的方式只能找到当前有这个对象，但是原来的地址的找不到了，所以只能给一个新的地址
         *
         * 解决方式：在类中添加名为readResolve()的方法，在反序列化时被反射调用，如果定义了这个方法，就返回这个方法的值，否则则返回new出来的对象
         */
//        write();
//        read();
//        read();


        /**
         * 使用反射的方式破坏单例
         */
//        //1.获取字节码对象
//        Class c=Singleton.class;
//        //2.获取无参构造方法对象
//        Constructor constructor = c.getDeclaredConstructor();
//        //3.取消访问检查（获取访问权限）
//        constructor.setAccessible(true);
//        //4.创建对象
//        Singleton s1= (Singleton) constructor.newInstance();
//        Singleton s2= (Singleton) constructor.newInstance();
//
//        System.out.println(s1);
//        System.out.println(s2);
    }

    //向文件中读对象
    public static void read()throws Exception{
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("/home/lyq/IdeaProjects/Design_pattern/src/Singleton_pattern/aa.txt"));
        //readObject()-->readObject0()-->TC_OBJECT-->readOrdinaryObject()-->desc.hasReadResolveMethod()(判断是否有readResolve()方法)
        Singleton s= (Singleton) objectInputStream.readObject();
        System.out.println(s);
        objectInputStream.close();
    }

    //向文件中写对象
    public static void write()throws Exception{
        Singleton s=Singleton.newSingleton();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("/home/lyq/IdeaProjects/Design_pattern/src/Singleton_pattern/aa.txt"));
        objectOutputStream.writeObject(s);
        objectOutputStream.close();
    }

}
