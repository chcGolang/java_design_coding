package com.chc.design_coding.interpreter.bridge.decorator.v2;

/**
 * @Author chc 
 * @Date 2019/4/20 14:37
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
