package fifthWork.persons;

public class Cleaner extends Staff {
    final static String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("The salary is 10000");
    }

    @Override
    void print() {
        System.out.println("I'm a..." + TYPE_PERSON);
    }
}
