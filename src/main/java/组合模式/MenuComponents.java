package 组合模式;

/**
 * 菜单组件，抽象根节点
 */
public abstract class MenuComponents {

    protected String name;

    protected int level;

    public void add(MenuComponents menuComponents){
        throw  new UnsupportedOperationException();
    }

    public void remove(MenuComponents menuComponents){
        throw  new UnsupportedOperationException();
    }

    public MenuComponents getChild(int index){
        throw  new UnsupportedOperationException();
    }

    public String getName(){
        return name;
    }

    public abstract void print();
}
