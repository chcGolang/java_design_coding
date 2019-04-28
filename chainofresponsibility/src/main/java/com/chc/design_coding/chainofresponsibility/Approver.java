package com.chc.design_coding.chainofresponsibility;

/**
 * @Author chc 
 * @Date 2019/4/28 11:07
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }
    public abstract void deploy(Course course);
}
