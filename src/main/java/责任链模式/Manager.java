package 责任链模式;

/**
 * 部门经理
 */
public class Manager  extends Handler{
    public Manager() {
        super(ONE, TWO);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println("部门经理审批同意");
    }
}
