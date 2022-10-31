package fourthWork.Car;

public class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Sedan("BMW", 200, 2007);
        cars[1] = new Truck("Chevrolet", 250, 2018);
        cars[2] = new Sedan("Toyota", 230, 2013);

        for (Car car : cars) {
            System.out.println(car.toString());
            car.run();
            car.stop();
        }
    }
}
