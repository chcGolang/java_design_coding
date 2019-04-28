package com.chc.design_coding.visitor;

/**
 * @Author chc 
 * @Date 2019/4/28 11:30
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
