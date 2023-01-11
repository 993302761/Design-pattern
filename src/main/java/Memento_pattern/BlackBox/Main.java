package Memento_pattern.BlackBox;

/**
 * 备忘录模式（黑箱）
 * 对发起人对象提供一个宽接口，对其他人都只提供一个窄接口
 *
 *  优点：提供了一种可恢复机制，实现了内部类的封装，简化了发起人类
 *  缺点：资源消耗大
 */
public class Main {
    public static void main(String[] args) {
        //创建游戏对象
        GameRole gameRole=new GameRole();
        gameRole.init();

        System.out.println(gameRole.getState());

        //将游戏角色内部状态备份
        RoleStateCaretaker roleStateCaretaker=new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        gameRole.fight();
        System.out.println(gameRole.getState());


        gameRole.recover(roleStateCaretaker.getMemento());
        System.out.println(gameRole.getState());
    }
}
