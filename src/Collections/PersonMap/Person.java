package Collections.PersonMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Person {
    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();
        personMap.put("Ivanenko", "Ivan");
        personMap.put("Romanenko", "Roman");
        personMap.put("Maxymenko", "Maxym");
        personMap.put("Evgenenko", "Evgen");
        personMap.put("Sergiyenko", "Ivan");
        personMap.put("Vadymenko", "Vadym");
        personMap.put("Nazarenko", "Nazar");
        personMap.put("Olexandrenko", "Olexandr");
        personMap.put("Artemenko", "Anton");
        personMap.put("Antonenko", "Anton");
        personMap.put("Globa", "Ivan");

        System.out.println(personMap);
        personMap.entrySet().removeIf(entry -> entry.getValue().equals("Roman"));
        System.out.println(personMap);

//        Map<String, Long>values = personMap
//                .values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println("Values Count : " + values);

        ArrayList<String> values = new ArrayList<String>();
        for (Map.Entry<String, String> name : personMap.entrySet()) {
            values.add(name.getValue());
        }
        for (String a : values) {
            int count = 0;
            for (Map.Entry<String, String> pair : personMap.entrySet()) {
                if (pair.getValue().equals(a)) {
                    count++;
                }
            }
            HashMap<String, Integer> pairs = new HashMap<>();
            pairs.put(a, count);
            Set<Map.Entry<String, Integer>> entry = pairs.entrySet();
            if (count > 1) {
                System.out.println(entry);
//                HashMap<String, Integer> pairs = new HashMap<>();
//                pairs.put(a, count);
//                Set<Map.Entry<String, Integer>> entry = pairs.entrySet();
//                System.out.println(entry);
                //System.out.printf("Counts: %d Name: %s\n", count, a);
            }
        }
    }
}


