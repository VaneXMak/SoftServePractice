package Collections.Union;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(7);
        set2.add(2);
        set2.add(9);
        Union union = new Union();
        System.out.println(union.union(set1, set2));
        System.out.println(union.intersect(set1, set2));
    }
}
