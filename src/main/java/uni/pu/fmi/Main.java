package uni.pu.fmi;

import uni.pu.fmi.decorator.*;
import uni.pu.fmi.strategy.RunningWithJumps;
import uni.pu.fmi.strategy.SleepingInTheBus;
import uni.pu.fmi.strategy.Teleportation;

public class Main {
    public static void main(String[] args) {
        University university = University.getInstance();

        Student student1 = new SuperFocus(new BasicStudent(new RunningWithJumps(), "вундеркинд"));
        Student student2 = new FastWriting(new BasicStudent(new Teleportation(), "фитнес маниак"));
        Student student3 = new Telepaty(new BasicStudent(new SleepingInTheBus(), "калитко"));

        System.out.println("--- Контролно за Студент 1 ---");
        university.conductExam(student1);

        System.out.println("\n--- Контролно за Студент 2 ---");
        university.conductExam(student2);

        System.out.println("\n--- Контролно за Студент 3 ---");
        university.conductExam(student3);
    }
}


