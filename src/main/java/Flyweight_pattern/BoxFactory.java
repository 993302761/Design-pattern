package Flyweight_pattern;

import java.util.HashMap;

/**
 * 工厂类（单例）
 */
public class BoxFactory {

    private HashMap<String,AbstractBox> hashMap;

    private BoxFactory() {
        hashMap = new HashMap<>();
        hashMap.put("I",new IBox());
        hashMap.put("L",new LBox());
        hashMap.put("O",new OBox());
        hashMap.put("Z",new ZBox());
    }

    public static BoxFactory getInstance(){
        return boxFactory;
    }

    private static BoxFactory boxFactory=new BoxFactory();

    public AbstractBox getShape(String name){
        return hashMap.get(name);
    }
}
