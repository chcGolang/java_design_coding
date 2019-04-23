package com.chc.design_coding.interpreter;

/**
 * @Author chc 
 * @Date 2019/4/23 20:56
 */
public class Main {
    public static void main(String[] args) {
        String geelyInputStr="6 100 11 + *";
        GeelyExpressionParser expressionParser=new GeelyExpressionParser();
        int result=expressionParser.parse(geelyInputStr);
        System.out.println("解释器计算结果: "+result);
    }
}
