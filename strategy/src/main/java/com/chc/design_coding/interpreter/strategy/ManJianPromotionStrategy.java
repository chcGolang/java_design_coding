package com.chc.design_coding.interpreter.strategy;

/**
 * @Author chc 
 * @Date 2019/4/23 20:45
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
