package fourthWork;

public class Student extends Person{
    String faculty;

    public Student() {
    }

    public Student(String name, int age, String faculty) {
        super(name, age);
        this.faculty = faculty;
    }
}
