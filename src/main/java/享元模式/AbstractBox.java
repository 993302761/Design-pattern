package 享元模式;

/**
 * 抽象享元角色
 */
public abstract class AbstractBox {

    //获取图形
    public abstract String getShape();

    //显示颜色
    public void display(String s){
        System.out.println("形状："+getShape()+" 颜色："+s);
    }
}
