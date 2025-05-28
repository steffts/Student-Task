package uni.pu.fmi.decorator;

import uni.pu.fmi.strategy.ArrivalStrategy;

public class BasicStudent extends Student {
    public BasicStudent(ArrivalStrategy strategy, String type) {
        super(strategy, type);
    }

    public void perform() {
        System.out.println("Работи по задачата използвайки:");
    }
}

