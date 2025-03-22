package arraydequeue;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> newArray = new ArrayDeque<>();
        newArray.add("Hello");
        newArray.add("My");
        newArray.add("name");
        newArray.add("is");

        System.out.println(newArray);


        ArrayDeque<String> zefir = new ArrayDeque<>();
        zefir.push("East");
        zefir.push("MiddleEast");
        zefir.push("West");
        zefir.push("Western");

        while (!zefir.isEmpty()) {
            System.out.println(zefir.pop());
        }

        ArrayDeque<String> cutting = new ArrayDeque<>();
        cutting.addFirst("Hello");
        cutting.addFirst("World");
        cutting.addFirst("My");
        cutting.addLast("name");
        cutting.addLast("is");
        cutting.addLast("Antonina");
        System.out.println(cutting);

        cutting.removeFirst();
        System.out.println(cutting);
        cutting.removeLast();
        System.out.println(cutting);
    }
}
