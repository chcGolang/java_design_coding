package com.chc.design_coding.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chc
 * @Date 2019/4/28 11:19
 */
public class Main {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for(Course course : courseList){
            course.accept(new Visitor());
        }

    }
}
