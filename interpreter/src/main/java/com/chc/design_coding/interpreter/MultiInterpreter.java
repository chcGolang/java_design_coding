package com.chc.design_coding.interpreter;

/**
 * @Author chc 
 * @Date 2019/4/23 20:56
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression,secondExpression;
    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression){
        this.firstExpression=firstExpression;
        this.secondExpression=secondExpression;
    }
    @Override
    public int interpret(){
        return this.firstExpression.interpret()*this.secondExpression.interpret();
    }
    @Override
    public String toString(){
        return "*";
    }

}
