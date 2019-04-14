package com.chc.design_coding.builder;

import lombok.Setter;

/**
 * @author chc
 * @create 2019-04-14 16:20
 **/
public class Coach {
    @Setter
    private CourseBuilder courseBuilder;

    public Course makeCourse(String courseArticle, String courseName, String courseQA,
                             String coursePPT , String courseVideo){
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseQA(courseQA);
        courseBuilder.buildCourseVideo(courseVideo);
        Course course = courseBuilder.makeCourse();
        return course;
    }
}
