package com.chc.design_coding.builder.v2;

import lombok.Getter;
import lombok.ToString;

/**
 * @author chc
 * @create 2019-04-14 16:59
 **/
@ToString
public class CourseV2 {
    // 课程名称
    private String courseName;
    // 课程ppt
    private String coursePPT;
    // 课程视频
    private String courseVideo;
    // 课程手记
    private String courseArticle;
    // 课程问题和答案
    private String courseQA;

    public CourseV2(CourseBuilderV2 builderV2){
        this.courseName = builderV2.getCourseName();
        this.coursePPT = builderV2.getCoursePPT();
        this.courseVideo = builderV2.getCourseVideo();
        this.courseArticle = builderV2.getCourseArticle();
        this.courseQA = builderV2.getCourseQA();
    }


    @Getter
    public static class CourseBuilderV2{
        // 课程名称
        private String courseName;
        // 课程ppt
        private String coursePPT;
        // 课程视频
        private String courseVideo;
        // 课程手记
        private String courseArticle;
        // 课程问题和答案
        private String courseQA;

        public CourseBuilderV2 builderCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public CourseBuilderV2 buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilderV2 buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilderV2 buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilderV2 buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public CourseV2 build(){
            return new CourseV2(this);
        }
    }
}
