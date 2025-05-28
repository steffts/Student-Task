package uni.pu.fmi.strategy;

public class SleepingInTheBus implements ArrivalStrategy {
    public void arrive() {
        System.out.println("Пристигане след спане в автобуса");
    }
}
