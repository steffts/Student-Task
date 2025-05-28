package uni.pu.fmi;

import uni.pu.fmi.decorator.*;
import uni.pu.fmi.strategy.ArrivalStrategy;
import uni.pu.fmi.strategy.RunningWithJumps;
import uni.pu.fmi.strategy.SleepingInTheBus;
import uni.pu.fmi.strategy.Teleportation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = University.getInstance();

        System.out.print("Въведете тип студент (вундеркинд / фитнес маниак / калитко): ");
        String type = scanner.nextLine().trim();

        System.out.println("Изберете начин на пристигане:");
        System.out.println("1. Тичане и подскачане\n2. Телепортация\n3. Спане в автобус");
        int choice = scanner.nextInt();
        scanner.nextLine();

        ArrivalStrategy strategy;
        switch (choice) {
            case 1: strategy = new RunningWithJumps(); break;
            case 2: strategy = new Teleportation(); break;
            case 3: strategy = new SleepingInTheBus(); break;
            default:
                System.out.println("Невалиден избор. Избира се спане в автобус по подразбиране.");
                strategy = new SleepingInTheBus();
        }

        Student student = new BasicStudent(strategy, type);

        System.out.println("Искате ли да добавите суперсила? (да/не)");
        String response = scanner.nextLine().trim();

        while (response.equalsIgnoreCase("да")) {
            System.out.println("Изберете суперсила: 1. Свръхконцентрация, 2. Бързопис, 3. Телепатия");
            int power = scanner.nextInt();
            scanner.nextLine();
            switch (power) {
                case 1: student = new SuperFocus(student); break;
                case 2: student = new FastWriting(student); break;
                case 3: student = new Telepaty(student); break;
                default:
                    System.out.println("Невалидна суперсила. Пропускане.");
            }
            System.out.println("Добавите ли друга суперсила? (да/не)");
            response = scanner.nextLine().trim();
        }

        System.out.println("--- Контролно за студента ---");
        university.Exam(student);
        scanner.close();
    }
}


