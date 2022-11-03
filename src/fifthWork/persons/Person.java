package fifthWork.persons;

public abstract class Person {
    String name;

    abstract void print();
}

class Test {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Teacher();
        persons[1] = new Cleaner();
        persons[2] = new Student();

        for (Person person: persons) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}