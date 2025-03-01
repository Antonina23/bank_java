package fortask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ForTasks forTasks = new ForTasks();

        forTasks.allNumbers();

        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        System.out.println(forTasks.sumNumbers(x));

        System.out.println("Введите любое число: ");
        int numb = scanner.nextInt();
        forTasks.mnogoNumbers(numb);


    }
}
