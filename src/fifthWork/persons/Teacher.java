package fifthWork.persons;

public class Teacher extends Staff{
    final static String TYPE_PERSON = "Teacher";

    public Teacher() {
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("The salary is 15000");
    }

    @Override
    void print() {
        System.out.println("I'm a..." + TYPE_PERSON);
    }
}
