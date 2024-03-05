package 建造者模式.demo1;

/**
 *
 */
public abstract class Builder {

    protected Bike bike=new Bike();

    public abstract void builderFrame();

    public abstract void builderSeat();

    public abstract Bike createBike();
}
