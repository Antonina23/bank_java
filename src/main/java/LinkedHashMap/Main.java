package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> first = new LinkedHashMap<>();
        first.put("Anna", 25);
        first.put("Harold", 36);
        first.put("Hans", 40);
        first.put("Peter", 18);
        first.put("Charles", 52);

        for (Map.Entry<String, Integer> entry : first.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }


        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Petr", "434343");
        phoneBook.put("Anna", "565656");
        phoneBook.put("James", "898989");
        phoneBook.put("Carry", "121212");
        phoneBook.put("Boris", "252525");

        String namess = "James";
        if(phoneBook.containsKey(namess)) {
            System.out.println("James contact has been found");
        } else {
            System.out.println("Contact hasn`t been found");
        }
    }
}
