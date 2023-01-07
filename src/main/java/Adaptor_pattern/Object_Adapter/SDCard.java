package Adaptor_pattern.Object_Adapter;

/**
 * 适配者类接口
 */
public interface SDCard {
    String SDRead();

    void SDWrite(String s);
}
