package uni.pu.fmi.decorator;

public abstract class StudentDecorator extends Student {
    protected Student decoratedStudent;

    public StudentDecorator(Student student) {
        super(student.arrivalStrategy, student.type);
        this.decoratedStudent = student;
    }
}
