package com.chc.design_coding.visitor;

/**
 * @Author chc 
 * @Date 2019/4/28 11:18
 */
public abstract class Course {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void accept(IVisitor visitor);

}
