package uni.pu.fmi.factory;

public class TaskFactory {
    public static Task createTask(String type) {
        switch (type) {
            case "вундеркинд": return new FunTask();
            case "фитнес маниак": return new HardTask();
            case "калитко": return new EasyTask();
            default: throw new IllegalArgumentException("Непознат тип студент");
        }
    }
}