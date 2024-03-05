package 享元模式;

/**
 * 享元模式
 * 利用共享技术来有效的支持大量细粒度对象的复用，减少了相似对象数量
 * 外部状态相对独立，且不影响内部状态
 */
public class Main {
    public static void main(String[] args) {
        AbstractBox o = BoxFactory.getInstance().getShape("O");
        o.display("灰色");

        AbstractBox l = BoxFactory.getInstance().getShape("L");
        l.display("蓝色");

        AbstractBox z = BoxFactory.getInstance().getShape("L");
        z.display("红色");

        //两次获取到的l图形是同一个对象
        System.out.println(l);
        System.out.println(z);


//        //  Integer会默认先创建并缓存-128~127之间数的Integer对象，当调用ValueOf时，如果参数在-128~127之间则计算下标并从缓存中返回，否则则创建一个新的Integer对象
//        Integer i1=127;
//        Integer i2=127;
//        System.out.println(i1==i2);
//
//        Integer i3=128;
//        Integer i4=128;
//        System.out.println(i3==i4);

    }
}
