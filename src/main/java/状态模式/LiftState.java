package 状态模式;

/**
 * 电梯接口（抽象状态类）
 */
public abstract class LiftState {

    protected  Context context;


    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
