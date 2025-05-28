package uni.pu.fmi;

import uni.pu.fmi.decorator.Student;
import uni.pu.fmi.factory.Task;
import uni.pu.fmi.factory.TaskFactory;

public class University {
    private static University instance;

    private University() {}

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public void Exam(Student student) {
        System.out.println("Студентът пристигна чрез: ");
        student.arrive();
        Task task = TaskFactory.createTask(student.getType());
        System.out.println("Получена задача: " + task.getDescription());

        student.perform();
    }
}

