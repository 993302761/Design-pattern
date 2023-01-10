package State_pattern;

public class Open extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.close);
        super.context.closing();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
