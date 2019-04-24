package com.chc.design_coding.command;

/**
 * @Author chc
 * @Date 2019/4/24 20:32
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println(this.name+"课程视频开放");
    }
    public void close(){
        System.out.println(this.name+"课程视频关闭");
    }
}
