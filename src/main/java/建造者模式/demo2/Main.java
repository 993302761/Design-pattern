package 建造者模式.demo2;

/**
 * 这种方式某种程度上可以提高开发效率，提供链式编程，可读性更高
 */
public class Main {
    public static void main(String[] args) {
        Phone phone=new Phone.Builder()
                .data1("1")
                .data2("2")
                .data3("3")
                .data4("4")
                .data5("5")
                .build();

        System.out.println(phone.toString());
    }
}
