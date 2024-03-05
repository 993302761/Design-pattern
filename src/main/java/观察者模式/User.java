package 观察者模式;

/**
 * 用户
 */
public class User  implements  ObServer{

    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String s) {
        System.out.println(name+"  "+s);
    }
}
