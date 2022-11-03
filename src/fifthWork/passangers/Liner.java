package fifthWork.passangers;

public class Liner extends WaterVehicle {
    int floors;

    public Liner() {
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        super.isSailing();
        System.out.println(" " + toString());
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                ", passengers=" + passengers +
                '}';
    }
}
