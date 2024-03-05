package 适配器模式.Object_Adapter;

/**
 * 适配者类
 */
public class TFCardImpl implements TFCard {

    @Override
    public String TFRead() {
        return "TF Message";
    }

    @Override
    public void TFWrite(String s) {
        System.out.println("TF Write Message :"+s);
    }
}
