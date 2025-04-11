package streamsumma;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> mineNumbers = Arrays.asList(1, 2, 3, 4, 5);

        int summa = mineNumbers.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(summa);
    }
}
