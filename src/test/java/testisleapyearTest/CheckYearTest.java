package testisleapyearTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testisleapyear.IsLeapYear;
import org.junit.jupiter.api.Assertions.*;
import java.util.stream.IntStream;

public class CheckYearTest {
    private final IsLeapYear checker = new IsLeapYear();

    @Test
    public void testLeapYear() {
        IntStream.of(2020, 2000, 1600)
                .forEach(year -> Assertions.assertTrue(checker.isLeapYear(year)));
    }

    @Test
    public void testNonLeapYear() {
        IntStream.of(2019, 2021, 2022)
                .forEach(year -> Assertions.assertFalse(checker.isLeapYear(year)));
    }

    @Test
    public void test100Year() {
        IntStream.of(21900, 2100)
                .forEach(year -> Assertions.assertFalse(checker.isLeapYear(year)));
    }

    @Test
    public void testCornerYear() {
        IntStream.of(0, 4, 400)
                .forEach(year -> Assertions.assertTrue(checker.isLeapYear(year)));
    }
}
