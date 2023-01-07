package Adaptor_pattern.Object_Adapter;

/**
 * 适配者类
 */
public class SDCardImpl implements SDCard {

    @Override
    public String SDRead()  {
        return "SD Message";
    }

    @Override
    public void SDWrite(String s) {
        System.out.println("SD Write Message :"+s);
    }
}
