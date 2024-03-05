package 状态模式;

public class Run extends LiftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stop);
        super.context.stopping();
    }
}
