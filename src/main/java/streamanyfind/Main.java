package streamanyfind;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> spisok = Arrays.asList(1, 2, 3, 4);

        boolean anyNumber = spisok.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(anyNumber);
    }
}
