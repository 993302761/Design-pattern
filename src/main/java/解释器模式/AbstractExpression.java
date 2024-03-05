package 解释器模式;

/**
 * 抽象表达式类
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
