package secondWork;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String str = "Червоне світло";
        if (t % 5 <= 3 && t != 0) {
           str = "Зелене світло";
        }
        System.out.println(str);
    }
}
