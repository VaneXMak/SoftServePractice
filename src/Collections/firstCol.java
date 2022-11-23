package Collections;

import java.util.*;

public class firstCol {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            myCollection.add(random.nextInt(25));
        }
        System.out.println(myCollection);
        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 5; i < myCollection.size(); i++) {
            newCollection.add(myCollection.get(i));
        }
        System.out.println(newCollection);
        myCollection.removeIf(integer -> integer > 20);
        System.out.println(myCollection);
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.printf("position – %d, value of element – %d\n", i, myCollection.get(i));
        }
        Collections.sort(myCollection);
        System.out.println(myCollection);
        Collections.sort(newCollection);
        System.out.println(newCollection);
    }

}

