package 模板方法模式;

public class ConcreteClass2 extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下白菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("放盐");
    }
}
