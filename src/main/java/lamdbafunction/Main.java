package lamdbafunction;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> strings = s -> s.length();

        System.out.println(strings.apply("Hello"));

    }
}
