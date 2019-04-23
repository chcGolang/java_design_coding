package com.chc.design_coding.interpreter.iterator;

/**
 * @Author chc 
 * @Date 2019/4/22 21:07
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
