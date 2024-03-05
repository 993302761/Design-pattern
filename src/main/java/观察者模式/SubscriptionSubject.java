package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色类
 */
public class SubscriptionSubject implements Subject{

    private List<ObServer> list=new ArrayList<>();

    @Override
    public void attach(ObServer obServer) {
        list.add(obServer);
    }

    @Override
    public void detach(ObServer obServer) {
        list.remove(obServer);
    }

    @Override
    public void notify(String s) {
        for (ObServer obServer : list) {
            obServer.update(s);
        }
    }
}
