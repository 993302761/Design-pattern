package 适配器模式.Object_Adapter;

/**
 * 适配者类接口
 */
public interface SDCard {
    String SDRead();

    void SDWrite(String s);
}
