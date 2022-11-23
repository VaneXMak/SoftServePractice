package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> empoyeeMap = new HashMap<>();
        empoyeeMap.put(100, "Ivan");
        empoyeeMap.put(250, "Anna");
        empoyeeMap.put(1000, "Hanna");
        empoyeeMap.put(25, "Nazar");
        empoyeeMap.put(380, "Vadym");
        empoyeeMap.put(943, "Olexandr");
        empoyeeMap.put(462, "Evgen");
        for (Map.Entry<Integer, String> entry : empoyeeMap.entrySet()) {
            System.out.println("Enter an ID: ");
            int id = scanner.nextInt();
            if (empoyeeMap.containsKey(id)) {
                System.out.println(entry.getValue());
                break;
            }
            else {
                System.out.println("There's no such key");
            }
        }
        for (Map.Entry<Integer, String> entry : empoyeeMap.entrySet()) {
            System.out.println("Enter a name: ");
            String name = scanner.next();
            if (empoyeeMap.containsValue(name)) {
                System.out.println(entry.getKey());
                break;
            }
            else {
                System.out.println("There's no such name");
            }
        }
    }
}
