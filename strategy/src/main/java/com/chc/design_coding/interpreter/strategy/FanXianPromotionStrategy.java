package com.chc.design_coding.interpreter.strategy;

/**
 * @Author chc 
 * @Date 2019/4/23 20:28
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到用户的余额中");
    }
}
