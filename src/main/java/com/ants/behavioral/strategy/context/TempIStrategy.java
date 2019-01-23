package com.ants.behavioral.strategy.context;

/**
 * 临时会员：临时会员也可打七折
 */
public class TempIStrategy implements IStrategy {
    public double curTicketPrice(Context context) {
        TempContext ctx = (TempContext)context;
        System.out.println("账号"+ctx.getAccount());
        return ctx.getPrice()*0.87;
    }
}

