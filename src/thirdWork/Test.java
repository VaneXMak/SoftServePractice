package thirdWork;

public class Test {
    public static void main(String[] args) {
//        Student st1 = new Student("Anna", 100);
//        Student st2 = new Student("Yurii", 30);
//        Student st3 = new Student("Olexander", 50);
//
//        System.out.printf("The first student is better than the 2d: %b\n", st1.betterStudent(st2));
//        System.out.printf("The second student is better than the 3d: %b\n", st2.betterStudent(st3));
//
//        System.out.println(st1.toString());
//        System.out.println(st2.toString());
//        System.out.println(st3.toString());
//        System.out.printf("The average rating is: %.2f\n", Student.calculateAvgRating(st1, st2, st3));
//        // if we use the method, the variable avgRating plays the role it was designed for
//        System.out.printf("The total sum is: %.2f", Student.avgRating);
//        // if we use just the variable itself, it plays the role of a total sum


        Employee e1 = new Employee("Ivan", 100, 1000);
        Employee e2 = new Employee("Vasiliy", 60, 800);
        Employee e3 = new Employee("Vadym", 90, 900);

        System.out.println(e1.toString());
        e1.changeRate(101);
        System.out.println(e1.toString());
        System.out.printf("10 percents of %d is %d\n", e1.getSalary(), e1.getBonuses());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.printf("The total salary of all workers is: %d", Employee.calculateTotalSum(e1, e2, e3));


//        Person p1 = new Person("Nazar", "Nazarenko");
//        Person p2 = new Person("Max", "Maxymenko");
//        Person p3 = new Person("Artem", "Artemenko");
//        Person p4 = new Person("Vadym", "Vadynenko");
//        Person p5 = new Person("Evgen", "Evgenko");
//
//        p1.input(2002);
//        p2.input(2003);
//        p3.input(2004);
//        p3.input(2005);
//        p5.input(2006);
//
//        p1.output();
//        p1.changeName("Andriy", "Andriyenko");
//        p1.output();
    }
}
