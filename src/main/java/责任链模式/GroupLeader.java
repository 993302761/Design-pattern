package 责任链模式;

/**
 * 小组长类（具体的处理者）
 */
public class GroupLeader extends Handler{
    public GroupLeader() {
        super(0,ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+" 请假"+ leave.getNum()+"天 "+ leave.getContent());
        System.out.println("组长审批同意");
    }
}
