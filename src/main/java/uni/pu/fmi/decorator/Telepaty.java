package uni.pu.fmi.decorator;

public class Telepaty extends StudentDecorator {
    public Telepaty(Student student) {
        super(student);
    }

    public void perform() {
        decoratedStudent.perform();
        System.out.println("Телепатия!");
    }
}
