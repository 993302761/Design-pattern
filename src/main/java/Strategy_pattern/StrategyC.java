package Strategy_pattern;

/**
 * 具体策略类
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
