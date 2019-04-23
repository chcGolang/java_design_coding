package com.chc.design_coding.interpreter.bridge.composite;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author chc 
 * @Date 2019/4/21 11:31
 */
public class Main {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("Java知识一期",55);
        CatalogComponent mmallCourse2 = new Course("Java知识二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent javaTimCourseCatalog = new CourseCatalog("Java课程子目录",3);

        CatalogComponent mmallCourseTim1 = new Course("Java子知识一期",55);
        CatalogComponent mmallCourseTim2 = new Course("Java子知识二期",66);
        CatalogComponent designPatternTim = new Course("Java子设计模式",77);

        javaTimCourseCatalog.add(mmallCourseTim1);
        javaTimCourseCatalog.add(mmallCourseTim2);
        javaTimCourseCatalog.add(designPatternTim);
        javaCourseCatalog.add(javaTimCourseCatalog);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        //imoocMainCourseCatalog.print();
        String toJSONString = JSONObject.toJSONString(imoocMainCourseCatalog);
        System.out.println(toJSONString);


    }
}
