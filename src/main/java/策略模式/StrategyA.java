package 策略模式;

/**
 * 具体策略类
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
