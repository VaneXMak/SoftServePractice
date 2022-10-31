package thirdWork;

public class Student {
    private String name;
    private int rate;
    static double avgRating;

    public Student() {
    }

    public Student(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public boolean betterStudent(Student st) {
        return (rate > st.rate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public static double calculateAvgRating(Student ... students) {
        for (Student student : students) {
            avgRating += student.rate;
        }
        return avgRating / students.length;
    }
}
