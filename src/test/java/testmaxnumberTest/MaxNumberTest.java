package testmaxnumberTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testmaxnumber.MaxNumber;

public class MaxNumberTest {
    private final MaxNumber finder = new MaxNumber();

    @Test
    public void testFindMax() {
        int[] numbers1 = {3, 5, 7, 2};
        System.out.println("Max at numbers1: " + finder.findMax(numbers1));
        Assertions.assertEquals(7, finder.findMax(numbers1));

        int[] numbers2 = {1};
        System.out.println("Max at numbers2: " + finder.findMax(numbers2));
        Assertions.assertEquals(1, finder.findMax(numbers2));

        int[] numbers3 = {-3, -5, -7, -2};
        System.out.println("Max at numbers3: " + finder.findMax(numbers3));
        Assertions.assertEquals(-2, finder.findMax(numbers3));
    }

    @Test
    public void testEmpty() {
        System.out.println("Check the empty array");
        int[] empty = {};
        Assertions.assertThrows(Exception.class, () -> finder.findMax(empty));
    }

    @Test
    public void testNull() {
        System.out.println("Check the null");
        Assertions.assertThrows(IllegalArgumentException.class, () -> finder.findMax(null));
    }
}
