package com.chc.design_coding.observer;

/**
 * @Author chc 
 * @Date 2019/4/23 21:03
 */
public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");


        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("Geely");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course,question);

    }
}