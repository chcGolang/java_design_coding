package com.chc.design_coding.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
