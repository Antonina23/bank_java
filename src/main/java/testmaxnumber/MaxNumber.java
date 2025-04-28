package testmaxnumber;

import java.util.Arrays;

public class MaxNumber {
    public int findMax(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        return Arrays.stream(numbers).max().orElseThrow();
    }
}