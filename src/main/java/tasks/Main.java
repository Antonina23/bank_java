package tasks;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите число");
      int x = scanner.nextInt();

      Tasks tasks = new Tasks();
      tasks.number(x);

      System.out.println("Введите первое число");
      int z = scanner.nextInt();

      System.out.println("Введите второе число");
      int y = scanner.nextInt();

      tasks.twoNumber(z, y);

      System.out.println("Введите оценку");
      int q = scanner.nextInt();

      tasks.ball(q);

      System.out.println("Введите любое число");
      int w = scanner.nextInt();

      tasks.whatNumber(w);
   }
}
