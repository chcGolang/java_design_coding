package com.chc.design_coding.bridge.singleton;

/**
 * 懒汉式单例
 * @author chc
 * @create 2019-04-18 20:50
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
