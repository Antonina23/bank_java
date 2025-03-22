package priorityqueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbersss = new PriorityQueue<>();
        numbersss.add(100);
        numbersss.add(20);
        numbersss.add(50);
        numbersss.add(10);
        numbersss.add(200);


        while (!numbersss.isEmpty()) {
            System.out.println(numbersss.poll());
        }
    }
}
