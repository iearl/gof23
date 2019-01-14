package coms.ants.behavior.strategy.context;

public class Context {
    private IStrategy IStrategy;
    private double price;


    public double getMethod() {
        return IStrategy.curTicketPrice(this);
    }
    public Context(IStrategy iStrategy, double price) {
        this.IStrategy = iStrategy;
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

    public void setPrice(double price) {
        this.price = price;
    }


}
