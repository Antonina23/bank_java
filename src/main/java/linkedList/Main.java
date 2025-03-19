package linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
       LinkedList<String> strings2 = new LinkedList<>();
       strings2.add("Hello");
       strings2.add("Hi");
       strings2.add("Hola");
       strings2.add("Bonjour");
       strings2.add("Ciao");
       System.out.println("Strings2: " + strings2);

        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Выпить чай");
        tasks.add("Скушать конфету");
        tasks.add("Помыть посуду");

        while (!tasks.isEmpty()) {
            String currentTask = tasks.removeFirst();
            System.out.println("Выполняю задачу: " + currentTask);
        }

        LinkedList<String> tea = new LinkedList<>();
        tea.add("Выпить чай");
        tea.add("Скушать конфету");
        tea.add("Помыть посуду");

        String firstTea = tea.removeFirst();
        System.out.println("После удаления первого элемента: " + tea);
        String lastTea = tea.removeLast();
        System.out.println("После удаления последнего элемента: " + tea);

        LinkedList<Integer> summary = new LinkedList<>();
        summary.add(1);
        summary.add(2);
        summary.add(3);
        summary.add(4);
        summary.add(5);

        int finalSum = 0;
        for (int i = 0; i < summary.size(); i++) {
            finalSum = finalSum + summary.get(i);
        }
        System.out.println("Summa: " + finalSum);

        LinkedList<String> coffee = new LinkedList<>();
        coffee.add("Выпить кофе");
        coffee.add("Скушать конфету");
        coffee.add("Помыть посуду");

        ListIterator<String> iteratorCoffee = coffee.listIterator();
        while (iteratorCoffee.hasNext()) {
            System.out.println("В процессе задача: " + iteratorCoffee.next());
        }

        while (iteratorCoffee.hasPrevious()) {
            System.out.println("В процессе задача: " + iteratorCoffee.previous());
        }
        }
    }