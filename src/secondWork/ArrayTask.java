package secondWork;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 12;
        int evenNum = 0;
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(1,20);
            if (A[i] % 2 == 0)
                evenNum++;
        }
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (max < A[i])
                max = A[i];
        }
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (min > A[i])
                min = A[i];
        }
        System.out.printf("Максимальне значення: %d\tМінімальне значення: %d", max, min);

        int medium = 0;
        for (int i = A.length / 2; i < A.length ; i++) {
            medium += A[i];
        }
        medium /= A.length - A.length / 2;
        System.out.printf("\nСереднє арифметичне: %d\n", medium);

        System.out.println(Arrays.toString(A));
        for (int i = 0, j = A.length - 1; i < A.length / 3; i++, j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        System.out.println(Arrays.toString(A));

        int[] B = new int[evenNum];
        int indexB = 0;
        int indexC = 0;
        int[] C = new int[n - evenNum];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[indexB] = A[i];
                indexB++;
            }
            else {
                C[indexC] = A[i];
                indexC++;
            }
        }
        System.out.println("Масив B: ");
        System.out.println(Arrays.toString(B));
        System.out.println("Масив C: ");
        System.out.println(Arrays.toString(C));
    }
}
