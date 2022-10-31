package secondWork;

import java.util.Scanner;

public class InputDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        char[] digits = number.toCharArray();
        System.out.printf("Кількість цифр: %d\n", digits.length);
        for (int i = 0; i < digits.length; i++) {
            int digit = Character.getNumericValue(digits[i]);
            if (digit > 4) {
                System.out.printf("Число більше 4: %d\n", digit);
            }
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(digits[i]);
            System.out.print(digit);
        }
    }

}
//        for (int i = 0; i < number.length(); i++) {
//            int digit = Character.getNumericValue(number.charAt(i));
//            if (digit > 4) {
//                System.out.printf("Число більше 4: %d", digit);
//            }
//            System.out.println();

