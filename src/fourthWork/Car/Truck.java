package fourthWork.Car;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    public void run() {
        System.out.println("Let's have a ride. Truck(c)");
    }
    public void stop() {
        System.out.println("We are done. It was a truck");
    }
}
