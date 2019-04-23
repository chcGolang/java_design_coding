package com.chc.design_coding.interpreter.bridge.decorator.v1;

/**
 * @Author chc 
 * @Date 2019/4/20 14:24
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
