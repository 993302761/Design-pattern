package Visitor_pattern;

public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("猫吃了猫粮");
    }
}
