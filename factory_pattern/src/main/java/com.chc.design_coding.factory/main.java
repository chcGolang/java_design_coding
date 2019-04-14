package com.chc.design_coding.factory;

/**
 * @author chc
 * @create 2019-04-14 11:18
 **/
public class main {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        videoFactory = new PythonVideoFactory();
        video = videoFactory.getVideo();
        video.produce();
    }
}
