package streammin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> againNumbers = Arrays.asList(5, 4, 10, 1);

        int minimum = againNumbers.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(minimum);
    }
}
