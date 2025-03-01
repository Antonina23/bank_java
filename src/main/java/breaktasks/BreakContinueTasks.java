package breaktasks;

import java.util.Scanner;

public class BreakContinueTasks {
    public void asknumber() {
        Scanner scanner = new Scanner(System.in);
        int number1 = 1;
        int number2 = 1;
        int sum;

        while(number1 >= 0 && number2 >= 0) {
            System.out.println("Введите первое положительное число: ");
            number1 = scanner.nextInt();

            if(number1 < 0) {
                break;
            }

            System.out.println("Введите второе положительное число: ");
            number2 = scanner.nextInt();

            if(number2 < 0) {
                break;
            }
            sum = number1 + number2;
            System.out.println(sum);
        }
    }

        public void onetwonumbers() {
            for(int i = 1; i <=20; i++) {
                if(i % 3 ==0) {
                    continue;
                }
                System.out.println(i);
            }
        }

        public void tennumbers() {
            int count = 0;
            int numb = 1;

            while (count < 10) {
                if (numb % 2 == 0 && numb % 5 == 0) {
                    System.out.println(numb);
                    count++;
                }
                numb++;
            }
        }
}
