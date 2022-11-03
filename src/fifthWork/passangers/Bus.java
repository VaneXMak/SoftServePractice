package fifthWork.passangers;

public class Bus extends GroundVehicle {
    String route;

    public Bus() {
    }

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bus{" +
                "route='" + route + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
