package 备忘录模式.WhiteBox;

/**
 * 备忘录模式（白箱）
 * 对任何一个对象都提供一个接口，即为宽接口，备忘录角色的内部状态对所有对象公开
 * 破坏了封装性，但可以通过程序员自律，在一定程度上实现模式的大部分用意
 */
public class Main {
    public static void main(String[] args) {
        //创建游戏对象
        GameRole gameRole=new GameRole();
        gameRole.init();

        System.out.println(gameRole.getState());

        //将游戏角色内部状态备份
        RoleStateCaretaker roleStateCaretaker=new RoleStateCaretaker();
        roleStateCaretaker.setRoleState(gameRole.saveState());

        gameRole.fight();
        System.out.println(gameRole.getState());


        gameRole.recover(roleStateCaretaker.getRoleState());
        System.out.println(gameRole.getState());
    }
}
