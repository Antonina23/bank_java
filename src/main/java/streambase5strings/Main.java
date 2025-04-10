package streambase5strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "Worlds", "Flowers", "Are", "You");

        List<String> sstring = words.stream()
                .filter(s -> s.length() >5)
                .collect(Collectors.toList());
        System.out.println(sstring);
    }
}
