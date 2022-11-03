package fifthWork.passangers;

public class Boat extends WaterVehicle {
    int volume;

    public Boat() {
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        super.isSailing();
        System.out.println(" " + toString());
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                ", passengers=" + passengers +
                '}';
    }
}
