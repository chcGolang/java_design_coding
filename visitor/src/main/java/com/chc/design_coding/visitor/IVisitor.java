package com.chc.design_coding.visitor;

/**
 * @Author chc 
 * @Date 2019/4/28 11:18
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);


}
