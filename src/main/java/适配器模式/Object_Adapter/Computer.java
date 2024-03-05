package 适配器模式.Object_Adapter;

/**
 * 计算机类
 */
public class Computer {

    public String read(SDCard sdCard){
        if (sdCard==null){
            return null;
        }
        return sdCard.SDRead();
    }
}
