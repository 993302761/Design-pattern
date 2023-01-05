package Prototype_pattern.Deep_cloning;

public class Prototype implements Cloneable{



    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void set1(String d){
        data.setData(d);
    }

    public Prototype() {
        System.out.println("创建成功");
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return (Prototype) super.clone();
    }
}
