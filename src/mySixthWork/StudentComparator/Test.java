package mySixthWork.StudentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 2));
        students.add(new Student("Vasyl", 3));
        students.add(new Student("Hanna", 1));
        students.add(new Student("Mark", 4));
        students.add(new Student("Vadym", 4));

        Collections.sort(students, new NameComparator());
        System.out.println(students);
        Collections.sort(students, new CourseComparator());
        System.out.println(students);
    }
}
