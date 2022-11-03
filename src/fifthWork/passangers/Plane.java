package fifthWork.passangers;

public class Plane extends FlyingVehicle {
    int maxDistance;

    public Plane() {
    }

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(toString());
    }

    @Override
    public void land() {
        super.land();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Plane{" +
                "passengers=" + passengers +
                ", maxDistance=" + maxDistance +
                '}';
    }
}
