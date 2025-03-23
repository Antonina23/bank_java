package keyvalue;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> booksss = new HashMap<>();
        booksss.put("Anna", "1111");
        booksss.put("Peter", "2222");
        booksss.put("James", "3333");
        System.out.println(booksss);

        if(booksss.containsKey("Anna")) {
            System.out.println(booksss.get("Anna"));
        }
    }
}
