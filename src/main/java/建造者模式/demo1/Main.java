package 建造者模式.demo1;

/**
 * 建造者模式
 * 封装性很好，客户端不必关注产品内部的组装过程，将产品本身和创建过程解耦
 * 可以更清晰的控制创建过程
 * 很容易扩展，如果创建对象较为复杂，且构造顺序是稳定的，且产品的构造过程和最终使用是独立的，则适合使用
 * 但如果产品间的差异化很大，则不适合
 */
public class Main {
    public static void main(String[] args) {
        Director director=new Director(new BikeBuilder_1());
        Bike construct = director.construct();

        System.out.println(construct.getFrame());
        System.out.println(construct.getSeat());

    }
}
