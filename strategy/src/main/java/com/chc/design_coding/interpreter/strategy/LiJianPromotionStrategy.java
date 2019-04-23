package com.chc.design_coding.interpreter.strategy;

/**
 * @Author chc 
 * @Date 2019/4/23 20:45
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
