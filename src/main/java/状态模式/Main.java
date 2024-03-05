package 状态模式;

/**
 * 状态模式
 * 将所有跟状态有关的行为都放在一个类中，并且可以方便地增加新状态，只需要改变对象状态即可改变行为
 * 当一个对象的行为取决于他的状态，并且必须要在运行时根据状态改变他的行为时，就可以考虑使用状态模式
 * 或者一个操作拥有庞大的分支结构，并且这些分支可以决定对象状态时也可以考虑使用
 */
public class Main {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context=new Context();

        //设置当前状态
        context.setLiftState(Context.open);
        context.closing();
        context.running();
        context.stopping();
    }
}
