package 解释器模式;

/**
 *
 * 减法表达式类
 */
public class Minus extends AbstractExpression{

    private AbstractExpression left;

    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + "-" + right + ')';
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context)-right.interpret(context);
    }
}
