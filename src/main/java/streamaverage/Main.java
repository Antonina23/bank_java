package streamaverage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> average = Arrays.asList(2, 4, 6);

        Double result = average.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(result);
    }
}
