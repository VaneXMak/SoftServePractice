package mySixthWork.StudentComparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCourse() == course) {
                System.out.println(iterator.next());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        return st1.getName().compareTo(st2.getName());
    }
}

class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        return st1.getCourse() - st2.getCourse();
    }
}
