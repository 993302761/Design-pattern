package 中介者模式;

/**
 * 中介者模式
 * 使耦合更松散，集中控制交互，一对多关联转为一对一关联
 * 当同事类太多时，中介者会变得复杂且庞大
 */
public class Main {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediatorStructure=new MediatorStructure();

        //创建同事类对象
        Tenant tenant=new Tenant("张三",mediatorStructure);
        HouseOwner houseOwner=new HouseOwner("李四",mediatorStructure);

        //中介者要知道谁是房主，谁是租房者
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);

        //消息发给中介，中介负责转发
        tenant.connect("我要租房");
        houseOwner.connect("ok");
    }
}
