package com.chc.design_coding.facade;

/**
 * @Author chc 
 * @Date 2019/4/20 13:29
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}
