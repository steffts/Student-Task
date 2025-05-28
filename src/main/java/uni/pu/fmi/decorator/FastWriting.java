package uni.pu.fmi.decorator;

public class FastWriting extends StudentDecorator {
    public FastWriting(Student student) {
        super(student);
    }

    public void perform() {
        decoratedStudent.perform();
        System.out.println("Бързопис");
    }
}

