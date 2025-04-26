package testlettercountTest;

import org.junit.jupiter.api.Test;
import testlettercount.VowelCounter;
import static org.junit.jupiter.api.Assertions.*;

public class VowelCounterTests {
    private final VowelCounter counter = new VowelCounter();

    @Test
    public void checkVowels() {
        // Проверяем каждое значение отдельно
        int helloCount = counter.countVowels("hello");
        System.out.println("hello: " + helloCount);
        assertEquals(2, helloCount);

        int javaCount = counter.countVowels("java");
        System.out.println("java: " + javaCount);
        assertEquals(2, javaCount);

        int aeiouCount = counter.countVowels("AEIOU");
        System.out.println("AEIOU: " + aeiouCount);
        assertEquals(5, aeiouCount);

        int emptyCount = counter.countVowels("");
        System.out.println("empty: " + emptyCount);
        assertEquals(0, emptyCount);

        int noVowelsCount = counter.countVowels("bcdfg");
        System.out.println("bcdfg: " + noVowelsCount);
        assertEquals(0, noVowelsCount);
    }

    @Test
    public void testNullInput() {
        System.out.println("Начало проверки null");
        try {
            counter.countVowels(null);
            System.out.println("Метод не выбросил исключение");
        } catch (Exception e) {
            System.out.println("Получено исключение: " + e.getClass().getSimpleName());
        }
        System.out.println("Конец проверки null");
    }
}