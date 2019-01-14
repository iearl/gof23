package coms.ants.behavior.strategy.context;

public class VipStrategy implements IStrategy {
    public double curTicketPrice(Context context) {
        return context.getPrice()*0.7;
    }
}
