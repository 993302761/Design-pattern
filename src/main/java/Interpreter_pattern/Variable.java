package Interpreter_pattern;

/**
 * 变量类
 */
public class Variable extends AbstractExpression {


    private String name;

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }


    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
