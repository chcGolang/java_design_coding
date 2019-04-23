package com.chc.design_coding.interpreter.bridge.singleton;

/**
 * @author chc
 * @create 2019-04-18 21:17
 **/
public class T implements Runnable {
    @Override
    public void run() {
        /*LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+lazySingleton);*/

        //LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+instance);
    }
}
