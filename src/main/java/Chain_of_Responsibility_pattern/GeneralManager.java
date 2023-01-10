package Chain_of_Responsibility_pattern;

public class GeneralManager extends Handler{
    public GeneralManager() {
        super(TWO, THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println("总经理审批同意");
    }
}
