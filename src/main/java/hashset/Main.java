package hashset;

import java.util.Set;
import java.util.HashSet;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("HashSet: " + numbers);

        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int x = 6;
        if (numbers.contains(6)) {
            System.out.println("HashSet contains number 6");
        }

        List<String> spisok = List.of("apple", "apple", "tomato", "cucumber", "banana");
        Set<String> fruits = removeDuplicates(spisok);
        System.out.println("Список с дубликатами: " + spisok);
        System.out.println("Множество без дубликатов: " + fruits);

        HashSet<String> names = new HashSet<>();
        names.add("Marry");
        names.add("Charlei");
        names.add("Emmy");
        names.add("Nataly");
        names.add("James");

        String emmy = "Emmy";
        if(names.contains("Emmy")) {
            System.out.println("HashSet contains " + emmy);
        }
        }

        public static Set<String> removeDuplicates(List<String> spisok) {
        return new HashSet<>(spisok);
        }

    }
