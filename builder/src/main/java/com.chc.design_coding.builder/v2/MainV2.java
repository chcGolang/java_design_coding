package com.chc.design_coding.builder.v2;

/**
 * @author chc
 * @create 2019-04-14 17:07
 **/
public class MainV2 {
    public static void main(String[] args) {
        CourseV2 courseV2 = new CourseV2.CourseBuilderV2().buildCoursePPT("PPT").buildCourseArticle("手记")
                .buildCourseVideo("视频").builderCourseName("课程名称").build();
        System.out.println(courseV2);
    }
}
