package com.chc.design_coding.adapter.classadapter;

/**
 * @Author chc 
 * @Date 2019/4/20 14:43
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
