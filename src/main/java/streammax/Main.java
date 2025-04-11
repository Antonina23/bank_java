package streammax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> theNumbers = Arrays.asList(1, 10, 20, 30);

        int maximum = theNumbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(maximum);

    }
}
