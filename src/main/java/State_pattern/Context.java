package State_pattern;

/**
 * 环境角色类
 */
public class Context {

    //定义四个状态的常量
    public final static Open open=new Open();
    public final static Close close=new Close();
    public final static Run run=new Run();
    public final static Stop stop=new Stop();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void opening(){
        this.liftState.open();
    }

    public void closing(){
        this.liftState.close();
    }

    public void running(){
        this.liftState.run();
    }

    public void stopping(){
        this.liftState.stop();
    }

}
