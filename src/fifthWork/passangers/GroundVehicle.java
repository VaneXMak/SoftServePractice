package fifthWork.passangers;

public class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle() {
    }

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public void drive() {
        System.out.println("I'm driving...");
    }
}
