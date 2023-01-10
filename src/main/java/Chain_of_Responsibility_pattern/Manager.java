package Chain_of_Responsibility_pattern;

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
