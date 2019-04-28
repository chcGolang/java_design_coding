package com.chc.design_coding.chainofresponsibility;

/**
 * @Author chc
 * @Date 2019/4/28 11:07
 */
public class Main {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式");
        course.setArticle("Java设计模式的手记");
        course.setVideo("Java设计模式总结视频");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
