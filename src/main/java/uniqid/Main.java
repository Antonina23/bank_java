package uniqid;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> uniqid = new HashSet<>();
        uniqid.add("id1");
        uniqid.add("id2");
        uniqid.add("id3");
        System.out.println(uniqid);

        String ids = "id2";
        if(uniqid.contains(ids)) {
            System.out.println("Пользователь с id: " + ids + " найден");
        }
    }
}
