package 观察者模式;

/**
 * 观察者模式（发布订阅模式）
 * 降低了目标和观察者之间的耦合关系，两者之间是抽象耦合关系
 * 被观察者发送通知，所有的观察者都会收到信息
 *
 * 使用场景：对象间存在一对多关系，一个对象的状态发生改变，会影响其他对象
 * （注意不要出现循环依赖）
 */
public class Main {
    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subscriptionSubject=new SubscriptionSubject();

        User user=new User("张三");
        User user1=new User("李四");

        subscriptionSubject.attach(user);
        subscriptionSubject.attach(user1);

        subscriptionSubject.notify("您好");
    }
}
