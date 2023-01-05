package Creator_pattern.demo2;

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
