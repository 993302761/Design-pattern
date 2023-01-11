package Visitor_pattern;

public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("狗吃了狗粮");
    }
}
