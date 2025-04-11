package streambletter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> wordsWords = Arrays.asList("Boris", "James", "Brus");

        Optional<String> newsWords = wordsWords.stream()
                .filter(s -> s.startsWith("B"))
                .findFirst();

        System.out.println(newsWords);
    }
}
