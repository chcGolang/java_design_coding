package com.chc.design_coding.state;

/**
 * @Author chc 
 * @Date 2019/4/28 11:31
 */
public class Main {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());


        courseVideoContext.speed();

    }
}
