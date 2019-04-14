package com.chc.design_coding.abstract_factory;

/**
 * @author chc
 * @create 2019-04-14 14:41
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
