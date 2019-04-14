package com.chc.design_coding.builder;

/**
 * @author chc
 * @create 2019-04-14 16:29
 **/
public class main {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBulider();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("课程手记", "课程名称", "课程问答", "课程PPT", "课程视频");
        System.out.println(course);
    }
}
