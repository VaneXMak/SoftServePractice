package thirdWork;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        LocalDate currentYear = LocalDate.now();
        return currentYear.getYear() - birthYear;
    }
    // типу конструктор 2.0, якщо ми вибрали дефолтний конструктор
    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    // перевантаження методу, якщо ми вибрали конструктор із двома аргументами
    public void input(int birthYear) {
        this.birthYear = birthYear;
    }

    public void output() {
        System.out.printf("First name is %s\nLast name is %s\nThe age is %d\n", firstName, lastName, getAge());
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
}
