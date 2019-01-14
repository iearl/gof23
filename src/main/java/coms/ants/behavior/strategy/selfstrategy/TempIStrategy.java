package coms.ants.behavior.strategy.selfstrategy;

public class TempIStrategy implements IStrategy {
    private String account;

    public TempIStrategy(String account) {
        this.account = account;
    }

    @Override
    public double curTicketPrice(Context context) {
        System.out.println("账号是："+account);
        return context.getPrice()*0.87;
    }
}
