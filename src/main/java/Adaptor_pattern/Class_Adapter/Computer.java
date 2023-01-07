package Adaptor_pattern.Class_Adapter;

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
