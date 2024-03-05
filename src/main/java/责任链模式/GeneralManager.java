package 责任链模式;

public class GeneralManager extends Handler{
    public GeneralManager() {
        super(TWO, THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println("总经理审批同意");
    }
}
