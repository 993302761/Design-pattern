package 中介者模式;

/**
 * 具体的中介者角色类
 */
public class MediatorStructure extends Mediator{

    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void connect(String message, Person person) {
        if (person==houseOwner){
            tenant.getMessage(message);
        }else {
            houseOwner.getMessage(message);
        }
    }
}
