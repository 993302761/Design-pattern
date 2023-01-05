package Factory_pattern.Config_Factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * 咖啡店类
 */
public class CoffeeShop {

    //定义容器，储存咖啡对象
    public static HashMap<String,Coffee> hashMap=new HashMap<>();

    //加载配置文件，只需要加载一次
    //配置文件默认识别为src下
    static {
        Properties p=new Properties();

        InputStream resourceAsStream = CoffeeShop.class.getClassLoader().getResourceAsStream("bean.properties");
        //调用p对象中的load方法进行配置文件的加载
        try {
            p.load(resourceAsStream);
            //创建对象并存储在容器中
            Set<Object> objects = p.keySet();
            for (Object key :
                    objects) {
                String className = p.getProperty((String) key);
                //通过反射创建对象
                Class aClass = Class.forName(className);
                Coffee coffee = (Coffee) aClass.newInstance();

                //存储在容器中
                hashMap.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public Coffee buyCoffee(String type){
        return hashMap.get(type);
    }
}
