package 备忘录模式.WhiteBox;

/**
 * 游戏角色类（属于发起人角色）
 */
public class GameRole {
    private int vit;    //生命
    private int atk;    //攻击
    private int def;    //防御

   public void init(){
       this.atk=100;
       this.def=100;
       this.vit=100;
   }

   //战斗
    public void fight(){
        this.atk=0;
        this.def=0;
        this.vit=0;
    }

    //保存状态
    public RoleState saveState(){
        return new RoleState(vit,atk,def);
    }


    public String getState() {
        return "{" +
                "生命=" + vit +
                ", 攻击=" + atk +
                ", 防御=" + def +
                '}';
    }

    //恢复角色状态
    public void recover(RoleState roleState){
       this.atk=roleState.getAtk();
       this.def=roleState.getDef();
       this.vit= roleState.getVit();
    }

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
}
