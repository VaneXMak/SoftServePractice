package fourthWork.Car;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    public void run() {
        System.out.println("Let's have a ride. Sedan(c)");
    }
    public void stop() {
        System.out.println("We are done. It was a sedan");
    }
}
