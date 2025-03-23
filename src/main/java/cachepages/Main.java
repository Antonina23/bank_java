package cachepages;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> userpages = new HashSet<>();
        int totalCount = 0;

        userpages.add("yandex.ru");
        totalCount++;

        userpages.add("yandex.ru");
        totalCount++;

        userpages.add("google.com");
        totalCount++;

        userpages.add("yahoo.com");
        totalCount++;

        System.out.println("Всего посещений: " + totalCount);
        System.out.println("Число уникальных страниц: " + userpages.size());

    }
}
