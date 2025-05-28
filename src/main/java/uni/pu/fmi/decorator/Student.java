package uni.pu.fmi.decorator;

import uni.pu.fmi.strategy.ArrivalStrategy;

public abstract class Student {
    protected ArrivalStrategy arrivalStrategy;
    protected String type;

    public Student(ArrivalStrategy strategy, String type) {
        this.arrivalStrategy = strategy;
        this.type = type;
    }

    public void arrive() {
        arrivalStrategy.arrive();
    }

    public String getType() {
        return type;
    }

    public abstract void perform();
}
