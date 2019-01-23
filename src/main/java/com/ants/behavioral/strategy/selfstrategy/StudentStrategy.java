package com.ants.behavioral.strategy.selfstrategy;

public class StudentStrategy implements IStrategy {
    public double curTicketPrice(Context context) {
        return context.getPrice()*0.8;
    }
}
