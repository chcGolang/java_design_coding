package com.chc.design_coding.visitor;

/**
 * @Author chc 
 * @Date 2019/4/28 11:18
 */
public class CodingCourse extends Course {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
