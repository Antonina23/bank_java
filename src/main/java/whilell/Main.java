package whilell;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WhileTasks whileTasks = new WhileTasks();

        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        System.out.println(whileTasks.facto(x));

        System.out.println("Введите любое число: ");
        int n = scanner.nextInt();
        whileTasks.chetno(n);

        System.out.println("Введите любое положительное число: ");
        int pe = scanner.nextInt();
        whileTasks.countdown(pe);
    }
}
