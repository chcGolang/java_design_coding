package com.chc.design_coding.state;

/**
 * @Author chc 
 * @Date 2019/4/28 11:30
 */
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();

}
