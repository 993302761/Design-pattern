package Command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类，属于请求者角色
 */
public class Waiter {

    private List<Command> commands=new ArrayList<>();

    public void setCommands(Command commands) {
        this.commands .add(commands) ;
    }

    public void orderUp(){
        for (Command c :
                commands) {
            if (c!=null){
                c.execute();
            }
        }
    }
}
