package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List: " + list);
        list.add(6);
        System.out.println("List: " + list);

        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println("List: " + list);

        ArrayList<String> stings = new ArrayList<>();
        stings.add("Hello");
        stings.add("beautiful");
        stings.add("perfect");
        stings.add("world");

        System.out.println("Strings: " + stings);

        String longest = stings.get(0);
        for (int i = 0; i < stings.size(); i++) {
            if(stings.get(i).length() > longest.length()) {
                longest = stings.get(i);
            }
        }
        System.out.println("Longest string: " + longest);

        ArrayList<Integer> summa = new ArrayList<>();
        summa.add(1);
        summa.add(2);
        summa.add(3);
        summa.add(4);
        System.out.println("Summa: " + summa);

        int sum = 0;
        for (int i = 0; i < summa.size(); i++) {
            sum = sum + summa.get(i);
        }
        System.out.println("Summa: " + sum);

        int maximum = summa.get(0);
        for (int i=0; i < summa.size(); i++) {
            if(summa.get(i) > maximum) {
                maximum = summa.get(i);
            }
        }
        System.out.println("Max: " + maximum);
    }
}
