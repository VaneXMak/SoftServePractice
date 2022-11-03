package fifthWork.persons;

public abstract class Staff extends Person{
    abstract void salary();

    @Override
    void print() {
        System.out.println("Some name");
    }
}
