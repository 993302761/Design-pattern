package Decorator_pattern;

/**
 * 具体的装饰者角色
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood){
        super(2, "培根", fastFood);
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
