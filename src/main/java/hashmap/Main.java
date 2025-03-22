package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAge = new HashMap<>();
        nameAge.put("Anna", 25);
        nameAge.put("Peter", 36);
        nameAge.put("Robert", 21);
        nameAge.put("Charley", 16);
        nameAge.put("Greg", 25);
        System.out.println(nameAge);

        for (String key : nameAge.keySet()) {
            System.out.println("Key: " + key + ", value: " + nameAge.get(key));
        }

        String name = "Anna";
        if(nameAge.containsKey(name)) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }

        printUnderage(nameAge);
    }

        public static void printUnderage(HashMap<String, Integer> map) {
            for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue() <18) {
                    System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
                }
            }

        }
}