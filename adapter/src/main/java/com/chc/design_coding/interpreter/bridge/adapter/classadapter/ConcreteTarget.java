package com.chc.design_coding.interpreter.bridge.adapter.classadapter;

/**
 * @Author chc 
 * @Date 2019/4/20 14:43
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
