package phones;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phones = new HashMap<>();
        phones.put("Anna", "1111");
        phones.put("Carry", "2222");
        phones.put("James", "3333");
        phones.put("Charlei", "4444");

        System.out.println(phones.get("Anna"));
        System.out.println(phones.containsValue("2222"));

    }
}
