package fifthWork.passangers;

public class Helicopter extends FlyingVehicle {
    int weight;
    int maxHeight;

    public Helicopter() {
    }

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
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
        return "Helicopter{" +
                "weight=" + weight +
                ", maxHeight=" + maxHeight +
                ", passengers=" + passengers +
                '}';
    }
}
