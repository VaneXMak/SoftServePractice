package fifthWork.passangers;

public class MotorCycle extends GroundVehicle {
    int maxSpeed;

    public MotorCycle() {
    }

    public MotorCycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
