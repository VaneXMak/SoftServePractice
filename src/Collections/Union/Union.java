package Collections.Union;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        return union;
//        for (Integer integer : union) {
//            if (!union.contains(integer)) {
//                union.add(integer);
//            }
//        }
    }

    public Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
        return new HashSet<>(set1);
//        for (Integer integer : set2) {
//            if (set1.contains(integer)) {
//                return new HashSet<>(set1);
//            }
//        }
    }
}
