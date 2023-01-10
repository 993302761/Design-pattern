package Chain_of_Responsibility_pattern;

/**
 * 责任链模式
 * 降低了对象之间的耦合度，满足开闭原则，增强了系统的扩展性和灵活性
 * 简化了对象间的连接,避免了众多的if else
 * 每个类只处理自己该处理的工作
 *
 * 缺点：不能保证每个请求一定被处理，可能会传到末端都得不到处理
 * 对于比较长的责任链，系统可能会受到影响
 */
public class Main {
    public static void main(String[] args) {
        LeaveRequest leaveRequest=new LeaveRequest("张三",1,"探亲");

        GroupLeader groupLeader=new GroupLeader();
        Manager manager=new Manager();
        GeneralManager generalManager=new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest);
    }
}
