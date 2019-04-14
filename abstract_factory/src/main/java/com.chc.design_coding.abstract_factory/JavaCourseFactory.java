package com.chc.design_coding.abstract_factory;

/**
 * @author chc
 * @create 2019-04-14 14:41
 **/
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
