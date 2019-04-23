package com.chc.design_coding.interpreter.strategy;

/**
 * @Author chc 
 * @Date 2019/4/23 20:45
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
