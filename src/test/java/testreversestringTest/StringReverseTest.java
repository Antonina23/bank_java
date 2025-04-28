package testreversestringTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import testreversestring.StringReverse;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StringReverseTest {
    private final StringReverse reverser = new StringReverse();

    @ParameterizedTest
    @MethodSource("testString")
    public void testReverse(String input, String expected) {
        String result = reverser.reverse(input);
        System.out.println(input + "->" + result);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testString() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("Java", "avaJ"),
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("12345", "54321"));
    }

    @Test
    public void testNull() {
        System.out.println("Check the null");
        String result = reverser.reverse(null);
        System.out.println("null: " + result);
        assertNull(result);
    }
}
