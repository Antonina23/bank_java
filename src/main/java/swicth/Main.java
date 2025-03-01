package swicth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SwitchTasks switchTasks = new SwitchTasks();
        System.out.println("Введите число: ");
        int inputDayNumber = scanner.nextInt();
        String resultday = switchTasks.daysWeek(inputDayNumber);
        System.out.println(resultday);


        System.out.println("Введите название планеты (одно из перечисленных: MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE): ");
        String inputPlanet = scanner.next();
        Planets planets = Planets.valueOf(inputPlanet);
        String resultPlanet = switchTasks.describePlanets(planets);
        System.out.println(resultPlanet);


        System.out.println("Введите первое число: ");
        double inputFirstNumber = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double inputSecondNumber = scanner.nextDouble();
        System.out.println("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double resultcalculation = switchTasks.calc(inputFirstNumber, inputSecondNumber, operator);
        System.out.println(resultcalculation);

    }
}
