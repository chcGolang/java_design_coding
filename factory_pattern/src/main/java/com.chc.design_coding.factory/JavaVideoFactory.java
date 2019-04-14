package com.chc.design_coding.factory;

/**
 * @author chc
 * @create 2019-04-14 11:16
 **/
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
