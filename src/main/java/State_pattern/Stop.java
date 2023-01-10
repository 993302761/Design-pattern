package State_pattern;

public class Stop extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.open);
        super.context.opening();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.run);
        super.context.running();
    }

    @Override
    public void stop() {
        System.out.println("电梯已停止");
    }
}
