package 装饰者模式;

/**
 * 具体的装饰者角色
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood){
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return getFastFood().cost()+getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
