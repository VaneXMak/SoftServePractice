package fourthWork.Bird;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers) {
        super(feathers);
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Nooo i can't fly " + toString());
    }
}
