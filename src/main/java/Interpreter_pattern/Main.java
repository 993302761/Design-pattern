package Interpreter_pattern;

/**
 * 解释器模式
 * 易于改变和扩展文法
 * 但对于复杂文法难以维护，执行效率低
 *
 * 当语言中的一个句子可以表示为抽象语法树的时候可以使用
 */
public class Main {
    public static void main(String[] args) {
        //获取环境对象
        Context context=new Context();

        //创建多个变量对象
        Variable a=new Variable("a");
        Variable b=new Variable("b");
        Variable c=new Variable("c");

        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);

        //获取抽象语法树
        AbstractExpression abstractExpression=new Minus(a,new Plus(b,c));

        int interpret = abstractExpression.interpret(context);

        System.out.println(abstractExpression+"="+interpret);
    }
}
