package 外观模式;

/**
 * 外观类
 */
public class SmartAPP {
    private Light light;
    private TV tv;
    private AirConditioner airConditioner;

    public SmartAPP() {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioner = new AirConditioner();
    }

    public void on(){
        light.on();
        tv.on();
        airConditioner.on();
    }

    public void off(){
        light.off();
        tv.off();
        airConditioner.off();
    }
}
