package 适配器模式.Object_Adapter;


/**
 * 对象适配器模式
 *
 * 符合合成复用原则，由于类适配器模式
 * java中的Reader、InputStream的适配用的是InputStreamReader
 * InputStreamReader继承自Reader
 */
public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer();
        SDAdapterTF sdAdapterTF=new SDAdapterTF(new TFCardImpl());
        String read = computer.read(sdAdapterTF);
        System.out.println(read);


    }
}
