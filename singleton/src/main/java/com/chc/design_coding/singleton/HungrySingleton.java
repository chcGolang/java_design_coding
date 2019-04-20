package com.chc.design_coding.singleton;

import java.io.Serializable;

/**
 * 单例-饿汉式
 * @Author chc
 * @Date 2019/4/20 10:57
 */
public class HungrySingleton implements Serializable,Cloneable{

    private final static HungrySingleton hungrySingleton;

    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 防止序列化，反序列化的破坏
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
