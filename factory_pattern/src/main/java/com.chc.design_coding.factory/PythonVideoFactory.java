package com.chc.design_coding.factory;

/**
 * @Author chc
 * @Date 2019/4/14 11:19
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
