package testsecondnumber;

import java.util.Arrays;

public class SecondNumber {
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(numbers.length - 2)
                .findFirst()
                .orElseThrow();
    }
}
