package com.chc.design_coding.mediator;

import java.util.Date;

/**
 * @Author chc 
 * @Date 2019/4/24 20:40
 */
public class StudyGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
