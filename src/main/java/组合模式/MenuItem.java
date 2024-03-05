package 组合模式;

public class MenuItem extends MenuComponents{
    public MenuItem(String name,int level) {
        this.level=level;
        this.name=name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
