package com.chc.design_coding.prototype.abstractprototype;

/**
 * @Author chc 
 * @Date 2019/4/20 13:34
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
