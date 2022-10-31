package fourthWork.Employee;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Olexandr", 25, 21500);
        Developer developer = new Developer("Van", 19, 20000, "Junior");

        developer.setSalary(30000);
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
