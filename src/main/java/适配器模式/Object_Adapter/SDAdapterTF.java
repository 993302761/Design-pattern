package 适配器模式.Object_Adapter;

public class SDAdapterTF  implements SDCard {

    //声明适配者类
    private TFCardImpl tfCard;

    public SDAdapterTF(TFCardImpl tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String SDRead() {
        return tfCard.TFRead();
    }

    @Override
    public void SDWrite(String s) {
        tfCard.TFWrite(s);
    }
}
