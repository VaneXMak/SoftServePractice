package Collections.StudentComparator;

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

        Collections.sort(students, (Student st1, Student st2) -> st1.getName().compareTo(st2.getName()));
        System.out.println(students);
        Collections.sort(students, (Student st1, Student st2) -> st1.getCourse() - st2.getCourse());
        System.out.println(students);
    }
}
