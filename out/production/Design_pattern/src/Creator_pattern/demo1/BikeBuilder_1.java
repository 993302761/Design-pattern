package Creator_pattern.demo1;

/**
 * 具体构建者
 */
public class BikeBuilder_1 extends Builder{
    @Override
    public void builderFrame() {
        bike.setFrame("frame-1");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("seat-1");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
