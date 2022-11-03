package fifthWork.passangers;

public class Car extends GroundVehicle {
    String model;

    public Car() {
    }

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
