package 访问者模式;

/**
 * 访问者模式
 * 扩展性好，，复用性好，分离无关行为
 * 但对于对象结构变化比较困难，违反了依赖倒置原则
 */
public class Main {
    public static void main(String[] args) {
        Home home=new Home();

        home.addAnimal(new Cat());
        home.addAnimal(new Dog());

        Owner owner=new Owner();
        home.action(owner);

        SomeOne someOne=new SomeOne();
        home.action(someOne);
    }
}
