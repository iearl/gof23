package com.ants.behavioral.strategy.context;

/**
 *
 */
public class TempContext extends Context {
    private String account;

    public String getAccount() {
        return account;
    }

    public TempContext(IStrategy iStrategy, double price,String account) {
        super(iStrategy, price);
        this.account = account;
    }
}
