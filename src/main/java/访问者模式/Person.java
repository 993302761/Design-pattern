package 访问者模式;

/**
 * 抽象访问者角色类
 */
public interface Person {

    void feed(Cat cat);

    void feed(Dog dog);
}
