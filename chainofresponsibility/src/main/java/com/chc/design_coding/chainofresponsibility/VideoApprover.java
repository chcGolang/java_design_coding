package com.chc.design_coding.chainofresponsibility;

import org.apache.commons.lang.StringUtils;

/**
 * @Author chc 
 * @Date 2019/4/28 11:17
 */
public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotEmpty(course.getVideo())){
            System.out.println(course.getName()+"含有视频,批准");
            if(approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含有视频,不批准,流程结束");
            return;
        }
    }
}
