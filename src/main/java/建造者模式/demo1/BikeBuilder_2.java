package 建造者模式.demo1;

public class BikeBuilder_2 extends Builder{
    @Override
    public void builderFrame() {
        bike.setFrame("frame-2");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("seat-2");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
