package com.chc.design_coding.mediator;

/**
 * @Author chc 
 * @Date 2019/4/24 20:40
 */
public class Test {
    public static void main(String[] args) {
        User geely = new User("Geely");
        User tom= new User("Tom");

        geely.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Geely");
    }


}
