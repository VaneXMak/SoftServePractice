package fourthWork.Bird;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers) {
        super(feathers);
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("C'mon flyyy " + toString());
    }
}
