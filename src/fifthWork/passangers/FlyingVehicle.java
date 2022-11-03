package fifthWork.passangers;

public class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public void fly() {
        System.out.println("I'm flying...");
    }

    public void land() {
        System.out.println("I'm landing...");
    }
}
