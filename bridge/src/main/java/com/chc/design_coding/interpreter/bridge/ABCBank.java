package com.chc.design_coding.interpreter.bridge;

/**
 * @Author chc 
 * @Date 2019/4/21 16:00
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
