package 中介者模式;

/**
 * 具体同事角色类
 */
public class HouseOwner extends Person{
        public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void connect(String message){
        mediator.connect(message,this);
    }

    public void getMessage(String message){
        System.out.println("房主 " +name+" 获取信息："+message);
    }
}
