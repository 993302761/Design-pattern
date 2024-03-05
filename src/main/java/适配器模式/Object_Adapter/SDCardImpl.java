package 适配器模式.Object_Adapter;

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
