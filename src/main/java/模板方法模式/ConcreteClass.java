package 模板方法模式;

public class ConcreteClass extends AbstractClass{


    @Override
    public void pourVegetable() {
        System.out.println("下包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("放味精");
    }
}
