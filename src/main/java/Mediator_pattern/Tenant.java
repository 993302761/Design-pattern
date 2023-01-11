package Mediator_pattern;

/**
 * 具体的同事角色类
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void connect(String message){
        mediator.connect(message,this);
    }

    public void getMessage(String message){
        System.out.println("租房者 " +name+" 获取信息："+message);
    }
}
