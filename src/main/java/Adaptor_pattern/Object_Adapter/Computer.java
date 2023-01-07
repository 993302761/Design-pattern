package Adaptor_pattern.Object_Adapter;

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
