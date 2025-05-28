package uni.pu.fmi.strategy;

public class Teleportation implements ArrivalStrategy {
    public void arrive() {
        System.out.println("Пристигане чрез телепортация");
    }
}
