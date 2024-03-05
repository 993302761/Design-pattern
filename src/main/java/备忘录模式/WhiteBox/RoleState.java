package 备忘录模式.WhiteBox;

/**
 * 备忘录角色类
 */
public class RoleState {
    private int vit;    //生命
    private int atk;    //攻击
    private int def;    //防御

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public RoleState(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }
}
