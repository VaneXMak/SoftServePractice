package fifthWork.wage;

public class SalariedEmployee extends Employee implements Payment{
    String socialSecurityNumber;

    @Override
    public double calculatePay() {
        return 0;
    }
}
