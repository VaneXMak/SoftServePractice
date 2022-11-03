package fifthWork.persons;

public class Student extends Person {
    final static String TYPE_PERSON = "Student";

    public Student() {
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I'm a..." + TYPE_PERSON);
    }
}
