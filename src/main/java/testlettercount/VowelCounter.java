package testlettercount;

import java.util.List;
import java.util.Arrays;

public class VowelCounter {
    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public static int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> VOWELS.contains((char) c))
                .count();
    }
}
