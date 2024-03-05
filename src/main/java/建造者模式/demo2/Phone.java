package 建造者模式.demo2;


public class Phone {
    private String data1;
    private String data2;
    private String data3;
    private String data4;
    private String data5;

    private Phone(Builder builder) {
        this.data1=builder.data1;
        this.data2=builder.data2;
        this.data3=builder.data3;
        this.data4=builder.data4;
        this.data5=builder.data5;

    }


    @Override
    public String toString() {
        return "Phone{" +
                "data1='" + data1 + '\'' +
                ", data2='" + data2 + '\'' +
                ", data3='" + data3 + '\'' +
                ", data4='" + data4 + '\'' +
                ", data5='" + data5 + '\'' +
                '}';
    }

    public static final class Builder{
        private String data1;
        private String data2;
        private String data3;
        private String data4;
        private String data5;

        public Builder data1(String data1) {
            this.data1 = data1;
            return this;
        }

        public Builder data2(String data2) {
            this.data2 = data2;
            return this;
        }

        public Builder data3(String data3) {
            this.data3 = data3;
            return this;
        }

        public Builder data4(String data4) {
            this.data4 = data4;
            return this;
        }

        public Builder data5(String data5) {
            this.data5 = data5;
            return this;
        }

        //使用构建者创建对象
        public Phone build(){
            return new Phone(this);
        }
    }
}
