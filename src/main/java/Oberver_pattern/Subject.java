package Oberver_pattern;

/**
 * 抽象主题角色类
 */
public interface Subject {

    //添加订阅者
    void attach(ObServer obServer);

    //删除订阅者
    void detach(ObServer obServer);

    //通知订阅者更新消息
    void notify(String s);
}
