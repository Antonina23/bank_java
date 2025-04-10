package lambdamathoperations;

public class Main {
    public static void main(String[] args) {
        MathOperations add = (x, y) -> x + y;
        MathOperations subtract = (x, y) -> x - y;
        MathOperations multiply = (x, y) -> x * y;
        MathOperations divide = (x, y) -> x / y;

        System.out.println(add.operate(2,7));
        System.out.println(subtract.operate(10, 8));
        System.out.println(multiply.operate(5, 5));
        System.out.println(divide.operate(50,5));

    }
}
