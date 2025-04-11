package streamgroupbynumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> fffff = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Object, List<Integer>> ssss = fffff.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(ssss);
    }
}
