package com.chc.design_coding.templatemethod;

/**
 * @Author chc 
 * @Date 2019/4/22 20:44
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}
