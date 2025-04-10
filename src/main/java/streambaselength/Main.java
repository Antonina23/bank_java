package streambaselength;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> myWords = Arrays.asList("Hello", "World", "Hey", "You");

        List<Integer> result = myWords.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
