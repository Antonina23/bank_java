package linkedhashset;

import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> five = new LinkedHashSet<>();
        System.out.println("Добавляем элемент: кот");
        five.add("кот");
        System.out.println(five);

        System.out.println("Добавляем элемент: собака");
        five.add("собака");
        System.out.println(five);

        System.out.println("Добавляем элемент: тигр");
        five.add("тигр");
        System.out.println(five);

        System.out.println("Добавляем элемент: лев");
        five.add("лев");
        System.out.println(five);

        System.out.println("Добавляем элемент: жираф");
        five.add("жираф");
        System.out.println(five);


        LinkedHashSet<String> animals = new LinkedHashSet<>();
        addElement(animals,"кот");
        addElement(animals,"кот");
        addElement(animals,"жираф");
        addElement(animals,"жираф");
        addElement(animals,"черепаха");

        System.out.println(animals);


        LinkedHashSet<String> cache = new LinkedHashSet<>();
        int maxSize = 5;

        addPage(cache, "google.com", maxSize);
        addPage(cache, "yandex.ru", maxSize);
        addPage(cache, "mail.ru", maxSize);
        addPage(cache, "yahoo.com", maxSize);
        addPage(cache, "google.com", maxSize);
        addPage(cache, "twitter.com", maxSize);
        addPage(cache, "yandex.ru", maxSize);

        System.out.println(cache);

    }
        public static void addElement (LinkedHashSet<String> animals, String element) {
        if(animals.add(element)) {
            System.out.println("Element: " + element + " has been added");
        } else {
            System.out.println("Element: " + element + " already exist");
        }
    }

        public static void addPage(LinkedHashSet<String> cache, String url, int maxSize) {
            cache.remove(url);

            if(cache.size() >= maxSize) {
                cache.remove(cache.iterator().next());
            }
            cache.add(url);
        }




}
