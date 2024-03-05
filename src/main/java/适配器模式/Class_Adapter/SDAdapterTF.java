package 适配器模式.Class_Adapter;

public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String SDRead() {
        return TFRead();
    }

    @Override
    public void SDWrite(String s) {
        TFWrite(s);
    }
}
