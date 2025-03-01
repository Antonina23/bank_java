package dowhiletasks;

import java.util.Scanner;

public class DoWhileTasks {
    public int asknumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Пожалуйста, введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    public String askpass() {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Пожалуйста, введите пароль: ");
            password = scanner.next();
        } while (!password.equals("Super"));
        return password;
    }

    public int oneten() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        return i;
    }


}
