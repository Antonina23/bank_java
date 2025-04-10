package lambdaconsumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> ourPrint = s -> System.out.println(s);

        ourPrint.accept("Hello, world");
    }
}
