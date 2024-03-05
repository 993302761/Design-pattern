package 状态模式;

public class Close extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.open);
        super.context.opening();
    }

    @Override
    public void close() {
        System.out.println("电梯已关闭");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.run);
        super.context.running();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stop);
        super.context.stopping();
    }
}
