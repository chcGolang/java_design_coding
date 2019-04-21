package com.chc.design_coding.bridge.facade;

/**
 * @author chc
 * @create 2019-04-20 13:33
 **/
public class Main {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
