package fifthWork.passangers;

public class Test {
    public static void main(String[] args) {
        Passengers[] passengers = new Passengers[6];
        passengers[0] = new Liner(1000, 4);
        passengers[1] = new Boat(50, 10);
        passengers[2] = new Plane(300, 7000);
        passengers[3] = new Helicopter(3, 1500, 5);
        passengers[4] = new Bus(100, "Kyiv");
        passengers[5] = new Car(4, "Toyota");

        for (Passengers passenger : passengers) {
            if (passenger instanceof WaterVehicle) {
                ((WaterVehicle) passenger).isSailing();
            } else if (passenger instanceof FlyingVehicle) {
                ((FlyingVehicle) passenger).fly();
                ((FlyingVehicle) passenger).land();
            } else {
                ((GroundVehicle) passenger).drive();
            }
        }
    }
}
