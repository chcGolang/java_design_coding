package com.chc.design_coding.interpreter.bridge.singleton;

/**
 * @author chc
 * @create 2019-04-18 20:55
 **/
public class Main {
    public static void main(String[] args) {
        //LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("new lazySingleton");


    }
}
