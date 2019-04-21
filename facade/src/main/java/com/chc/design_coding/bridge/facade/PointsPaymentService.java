package com.chc.design_coding.bridge.facade;

/**
 * @Author chc 
 * @Date 2019/4/20 13:57
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }

}
