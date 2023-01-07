package Adaptor_pattern.Class_Adapter;


/**
 * 类适配器模式
 * 违反了合成复用原则，必须是客户类有一个接口规范的情况下才可以使用
 */
public class Main {
    public static void main(String[] args) {

        Computer computer=new Computer();
//        String read = computer.read(new SDCardImpl());
//        System.out.println(read);


        String read = computer.read(new SDAdapterTF());
        System.out.println(read);

    }
}
