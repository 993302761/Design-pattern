package Composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponents{

    private List<MenuComponents> list=new ArrayList<MenuComponents>();

    public Menu(String name,int level) {
        this.name=name;
        this.level=level;
    }

    @Override
    public void add(MenuComponents menuComponents) {
        list.add(menuComponents);
    }

    @Override
    public void remove(MenuComponents menuComponents) {
        list.remove(menuComponents);
    }

    @Override
    public MenuComponents getChild(int index) {
        return list.get(index);
    }

    @Override
    public void print() {
        //打印菜单名称
        System.out.println(name);
        //打印子菜单和子菜单项名称
        for (MenuComponents m :
                list) {
            m.print();
        }
    }
}
