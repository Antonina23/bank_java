package tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int inputNumber = scanner.nextInt();

        Tasks tasks = new Tasks();
        String result = tasks.number(inputNumber);
        System.out.println(result);

        System.out.println("Введите первое число: ");
        int inputTwoNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int inputThreeNumber = scanner.nextInt();

        int maxNumber = tasks.twice(inputTwoNumber, inputThreeNumber);
        System.out.println(maxNumber);

        System.out.println("Введите оценку: ");
        int inputStar = scanner.nextInt();

        String result2 = tasks.star(inputStar);
        System.out.println(result2);

    }
}
