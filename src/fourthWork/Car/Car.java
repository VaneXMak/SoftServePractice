package fourthWork.Car;

public abstract class Car {
    String model;
    int maxSpeed;
    int yearOfManufacture;

    public Car() {}
    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void run();
    public abstract void stop();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufecture=" + yearOfManufacture +
                '}';
    }
}
