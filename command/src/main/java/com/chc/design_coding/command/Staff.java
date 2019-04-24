package com.chc.design_coding.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chc
 * @Date 2019/4/24 20:32
 */
public class Staff {
    private List<Command> commandList = new ArrayList<Command>();
    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }

}
