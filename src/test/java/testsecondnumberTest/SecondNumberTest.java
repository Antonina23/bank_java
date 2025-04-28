package testsecondnumberTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testsecondnumber.SecondNumber;

public class SecondNumberTest {
    private final SecondNumber findMax = new SecondNumber();

    @Test
    public void testSimpleArray() {
        int[] numbers = {3, 5, 7, 2};
        Assertions.assertEquals(5, findMax.findSecondMax(numbers));
    }

    @Test
    public void testSameArray() {
        int[] numbers = {4, 4, 4, 4};
        Assertions.assertThrows(Exception.class, () -> findMax.findSecondMax(numbers));
    }

    @Test
    public void testOneArray() {
        int[] numbers = {8};
        Assertions.assertThrows(Exception.class, () -> findMax.findSecondMax(numbers));
    }

    @Test
    public void testEmptyArray() {
        int[] numbers = {};
        Assertions.assertThrows(Exception.class, () -> findMax.findSecondMax(numbers));
    }
}
