package 访问者模式;

public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("狗吃了狗粮");
    }
}
