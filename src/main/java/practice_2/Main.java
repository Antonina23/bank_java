package practice_2;

import practice_rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 2015);

        toyota.print();

        toyota.setYear(2020);
        toyota.print();
    }

}
