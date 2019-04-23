package com.chc.design_coding.interpreter.bridge.adapter.objectadapter;

/**
 * @Author chc 
 * @Date 2019/4/20 14:43
 */
public class Main {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();



    }
}
