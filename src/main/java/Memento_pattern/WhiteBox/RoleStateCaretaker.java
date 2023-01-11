package Memento_pattern.WhiteBox;

/**
 * 备忘录对象管理类
 */
public class RoleStateCaretaker {

    private RoleState roleState;

    public RoleState getRoleState() {
        return roleState;
    }

    public void setRoleState(RoleState roleState) {
        this.roleState = roleState;
        this.roleState.setAtk(50);
        this.roleState.setDef(50);
        this.roleState.setVit(50);
    }
}
