package testfactorialTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testfactorial.Factorial;

import java.util.stream.IntStream;

public class FactorialTest {
    private final Factorial factorial = new Factorial();

    @Test
    public void testBasic() {
        Assertions.assertEquals(1, factorial.factorial(0));
    }

    @Test
    public void testSimple() {
        Assertions.assertEquals(1, factorial.factorial(1));
        Assertions.assertEquals(120, factorial.factorial(5));
        Assertions.assertEquals(5040, factorial.factorial(7));
    }

    @Test
    public void testNegative() {
        IntStream.of(-1, -3, -5)
                .forEach(n -> Assertions.assertThrows(IllegalArgumentException.class,
                        () -> factorial.factorial(n)));
    }

}
