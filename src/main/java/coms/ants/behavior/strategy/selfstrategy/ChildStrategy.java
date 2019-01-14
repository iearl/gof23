package coms.ants.behavior.strategy.selfstrategy;

public class ChildStrategy implements IStrategy {
    public double curTicketPrice(Context context) {
        return context.getPrice()*0.5;
    }
}
