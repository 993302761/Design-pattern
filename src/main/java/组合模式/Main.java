package 组合模式;


/**
 * 组合模式（部分整体模式）
 * 用于把一组相似的对象当做一个单一的对象,可以清楚地定义分层次的组合对象，队客户端来说简化了代码编写
 *
 * 组合模式正是应树形结构而生，能出现树形结构的地方都可以用
 */
public class Main {
    public static void main(String[] args) {
        MenuComponents menuComponents=new Menu("系统",1);

        MenuComponents menuComponents1=new Menu("菜单管理",2);
        menuComponents1.add(new MenuItem("页面访问",3));
        menuComponents1.add(new MenuItem("打开页面",3));
        menuComponents1.add(new MenuItem("关闭页面",3));

        MenuComponents menuComponents2=new Menu("权限管理",2);
        menuComponents2.add(new MenuItem("页面访问",3));
        menuComponents2.add(new MenuItem("提交保存",3));

        MenuComponents menuComponents3=new Menu("角色管理",2);
        menuComponents3.add(new MenuItem("新增角色",3));
        menuComponents3.add(new MenuItem("修改角色",3));

        menuComponents.add(menuComponents1);
        menuComponents.add(menuComponents2);
        menuComponents.add(menuComponents3);


        menuComponents.print();
    }
}
