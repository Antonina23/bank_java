package treemap;

import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> balls = new TreeMap<>();
        balls.put("Anna", 5);
        balls.put("Peter", 4);
        balls.put("James", 5);
        balls.put("Karina", 4);

        for (Map.Entry<String, Integer> entry : balls.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        String key1 = balls.firstKey();
        String key2 = balls.lastKey();
        System.out.println(key1);
        System.out.println(key2);


        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(1, "Bond");
        employees.put(2, "Arina");
        employees.put(15, "Cameron");
        employees.put(8, "Jinny");

        System.out.println(employees.higherKey(6));
    }
}
