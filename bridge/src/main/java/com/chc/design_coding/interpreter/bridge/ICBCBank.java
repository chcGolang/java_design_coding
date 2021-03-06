package com.chc.design_coding.interpreter.bridge;

/**
 * @Author chc
 * @Date 2019/4/21 16:00
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
