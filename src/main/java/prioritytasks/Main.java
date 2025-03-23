package prioritytasks;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> newtasks = new LinkedList<>();
        newtasks.add("First task");
        newtasks.add("Second task");
        newtasks.add("Third task");

        System.out.println(newtasks);

        while (!newtasks.isEmpty()) {
            System.out.println(newtasks.poll());
        }
    }
}
