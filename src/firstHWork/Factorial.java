package firstHWork;

public class Factorial {
    public static int fact(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
           result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        float result = (float) (2 * fact(5) + 3 * fact(8)) /
                (fact(6) + fact(4));
        System.out.printf("Значення виразу: %.2f", result);
    }
}
