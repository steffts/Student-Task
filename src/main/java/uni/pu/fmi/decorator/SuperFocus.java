package uni.pu.fmi.decorator;

public class SuperFocus extends StudentDecorator {
    public SuperFocus(Student student) {
        super(student);
    }

    public void perform() {
        decoratedStudent.perform();
        System.out.println("Свръхконцентрация!");
    }
}