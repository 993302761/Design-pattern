package 建造者模式.demo1;


/**
 * 指挥者类，用于指导建造者如何构建产品控制先后顺序
 * 也可以把指挥者和抽象建造者结合，如果construct()过于复杂，则不建议合并
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct(){
        builder.builderFrame();
        builder.builderSeat();
        return builder.createBike();
    }
}

