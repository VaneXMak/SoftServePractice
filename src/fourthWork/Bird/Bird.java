package fourthWork.Bird;

public abstract class Bird {
    String feathers;
    final boolean layEggs = true;

    public Bird(String feathers) {
        this.feathers = feathers;
    }

    public void fly() {}
}
