package 访问者模式;

public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("我喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("我喂狗");
    }
}
