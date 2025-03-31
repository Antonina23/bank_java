package arraygeneric;

public class Main {
    public static void main(String[] args) {
        String[] name = {"Anna", "Marry", "Nicole"};
        ArrayPrinter<String> stringPrinter = new ArrayPrinter<>(name);
        stringPrinter.printArray();

        Integer[] number = {1, 2, 3};
        ArrayPrinter<Integer> integerPrinter = new ArrayPrinter<>(number);
        integerPrinter.printArray();

    }
}
