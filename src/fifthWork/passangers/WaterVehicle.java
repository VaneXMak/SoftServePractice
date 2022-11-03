package fifthWork.passangers;

public class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle() {
    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public void isSailing() {
        System.out.println("I'm a sailing");
    }
}
