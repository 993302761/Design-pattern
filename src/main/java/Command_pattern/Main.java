package Command_pattern;

/**
 * 命令模式
 * 降低系统耦合度，满足开闭原则
 * 可和组合模式结合，组成宏命令
 * 方便实现Undo和Redo的操作，可和备忘录模式结合，实现命令的撤销与恢复
 *
 * 使用场景：系统需要将请求调用者和请求接受者解耦，使其不直接交互
 *
 * Runnable是一个典型的命令模式,Runnable充当命令角色，Thread充当调用者，start就是执行方法
 */
public class Main {
    public static void main(String[] args) {
        Order order=new Order();
        order.setTableNo(10);
        order.setFood("辣椒炒肉",1);
        order.setFood("饭",1);
        order.setFood("面",1);


        Order order1=new Order();
        order1.setTableNo(12);
        order1.setFood("泡菜",2);

        Cook cook=new Cook();
        //创建命令对象
        OrderCommand orderCommand=new OrderCommand(cook,order);
        OrderCommand orderCommand1=new OrderCommand(cook,order1);

        //创建调用者
        Waiter waiter=new Waiter();
        waiter.setCommands(orderCommand);
        waiter.setCommands(orderCommand1);

        //发起命令
        waiter.orderUp();
    }
}
