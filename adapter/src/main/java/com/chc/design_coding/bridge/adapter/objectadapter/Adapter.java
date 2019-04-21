package com.chc.design_coding.bridge.adapter.objectadapter;

/**
 * @Author chc 
 * @Date 2019/4/20 14:43
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
