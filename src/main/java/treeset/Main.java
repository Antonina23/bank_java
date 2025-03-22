package treeset;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(11);
        tree.add(2);
        tree.add(51);
        tree.add(6);
        tree.add(10);

        System.out.println(tree);

        TreeSet<Integer> noduplicate = new TreeSet<>();
        addNoDuplicate(noduplicate, 1);
        addNoDuplicate(noduplicate, 10);
        addNoDuplicate(noduplicate, 11);
        addNoDuplicate(noduplicate, 1);

        System.out.println(noduplicate);


        TreeSet<Integer> higherLower = new TreeSet<>();
        higherLower.add(1);
        higherLower.add(5);
        higherLower.add(90);
        higherLower.add(15);
        higherLower.add(10);
        higherLower.add(8);

        System.out.println(higherLower);

        int number = 23;

        int higher = higherLower.higher(number);
        int lower = higherLower.lower(number);

        if(higher !=0) {
            System.out.println(higher);
        }
        if(lower !=0) {
            System.out.println(lower);
        }


    }
        public static void addNoDuplicate (TreeSet<Integer> noduplicate, Integer element) {
            if(!noduplicate.contains(element)) {
                noduplicate.add(element);
            }
        }
}
