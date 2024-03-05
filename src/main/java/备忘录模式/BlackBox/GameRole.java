package 备忘录模式.BlackBox;

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
    public Memento saveState(){
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
    public void recover(Memento memento){
       RoleState roleState= (RoleState) memento;
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


    //将备忘录角色类定义在发起者角色类中，并且私有
    private class RoleState implements Memento{

        private int vit;    //生命
        private int atk;    //攻击
        private int def;    //防御

        public RoleState() {
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

        public RoleState(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }
    }
}
