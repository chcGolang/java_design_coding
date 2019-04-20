package com.chc.design_coding.decorator.v1;

/**
 * @Author chc 
 * @Date 2019/4/20 14:01
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
