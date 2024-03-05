package 解释器模式;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<Variable,Integer> map=new HashMap<>();

    public void assign(Variable variable,Integer integer){
        map.put(variable,integer);
    }


    public int getValue(Variable variable){
        return map.get(variable);
    }
}
