package teststringTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import teststring.CheckString;

public class CheckStringTest {
    private final CheckString wordcount = new CheckString();

    @Test
    public void simpleString() {
        Assertions.assertEquals(2, wordcount.countWords("Hello world"));
    }

    @Test
    public void pauseString() {
        Assertions.assertEquals(3, wordcount.countWords("Java is awesome "));
    }

    @Test
    public void emptyString() {
        Assertions.assertEquals(0, wordcount.countWords(""));
    }

    @Test
    public void noString() {
        Assertions.assertEquals(0, wordcount.countWords(" "));
    }

    @Test
    public void nullString() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> wordcount.countWords(null));
    }
}
