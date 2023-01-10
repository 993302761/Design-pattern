package Chain_of_Responsibility_pattern;

/**
 * 抽象处理者
 */
public abstract class Handler {
    protected final static int ONE=1;
    protected final static int TWO=2;
    protected final static int THREE=3;

    private int start;
    private int end;

    private Handler nextHandler;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Handler(int start) {
        this.start = start;
    }

    //处理请假条
    protected abstract void  handlerLeave(LeaveRequest leave);

    //提交请假条
    public final void submit(LeaveRequest leaveRequest){
        this.handlerLeave(leaveRequest);
        if (this.nextHandler!=null&&leaveRequest.getNum()>this.end){
            this.nextHandler.submit(leaveRequest);
        }else {
            System.out.println("处理完成");
        }
    }
}
