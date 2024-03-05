package 访问者模式;

public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("猫吃了猫粮");
    }
}
