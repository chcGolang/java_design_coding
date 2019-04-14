package com.chc.design_coding.abstract_factory;

/**
 * @author chc
 * @create 2019-04-14 14:50
 **/
public class main {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
