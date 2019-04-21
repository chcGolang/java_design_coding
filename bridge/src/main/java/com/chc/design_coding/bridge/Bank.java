package com.chc.design_coding.bridge;

/**
 * @Author chc
 * @Date 2019/4/21 16:00
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
