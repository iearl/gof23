package coms.ants.behavior.strategy.simple;

public class Context {
    private IStrategy IStrategy;
    private double price;


    public double getMethod() {
        return IStrategy.curTicketPrice(this);
    }
    public Context(IStrategy IStrategy, double price) {
        this.IStrategy = IStrategy;
        this.price = price;
    }

    public IStrategy getIStrategy() {
        return IStrategy;
    }

    public void setIStrategy(IStrategy IStrategy) {
        this.IStrategy = IStrategy;
    }

    public double getPrice() {
        return price;
    }
}
