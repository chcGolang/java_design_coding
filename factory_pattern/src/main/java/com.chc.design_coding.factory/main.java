package com.chc.design_coding.factory;

/**
 * @author chc
 * @create 2019-04-14 11:18
 **/
public class main {
    /**
     * 只需要关心所需产品对应的工厂,无须关心创建细节
     * 扩展性高
     * @param args
     */
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        videoFactory = new PythonVideoFactory();
        video = videoFactory.getVideo();
        video.produce();
    }
}
