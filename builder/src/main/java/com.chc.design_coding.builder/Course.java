package com.chc.design_coding.builder;

import lombok.Data;
import lombok.ToString;

/**
 * @author chc
 * @create 2019-04-14 16:06
 **/
@Data
@ToString
public class Course {
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
}
