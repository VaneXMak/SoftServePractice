package fourthWork.Bird;

public class Test {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("Vane");
        birds[1] = new Swallow("Tapered");
        birds[2] = new Penguin("Downy");
        birds[3] = new Chicken("Contour");

        for (Bird bird : birds) {
            bird.fly();
        }
    }
}
