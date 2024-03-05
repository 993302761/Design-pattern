package 模板方法模式;

/**
 * 抽象类（定义模板方法和基本方法）
 */
public abstract class AbstractClass {

    //模板方法定义
    public void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    void pourOil(){
        System.out.println("倒油");
    }

    void heatOil(){
        System.out.println("热油");
    }

    //下菜
    public abstract void pourVegetable();

    //下调味料
    public abstract void pourSauce();

    public void fry(){
        System.out.println("翻炒");
    }
}
