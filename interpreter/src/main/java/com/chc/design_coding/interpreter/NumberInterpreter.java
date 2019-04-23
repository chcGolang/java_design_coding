package com.chc.design_coding.interpreter;

/**
 * @Author chc 
 * @Date 2019/4/23 20:46
 */
public class NumberInterpreter implements Interpreter {
    private int number;
    public NumberInterpreter(int number){
        this.number=number;
    }
    public NumberInterpreter(String number){
        this.number=Integer.parseInt(number);
    }
    @Override
    public int interpret(){
        return this.number;
    }
}
