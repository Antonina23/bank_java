package testevenoddnumbersTest;

import org.junit.jupiter.api.Test;
import testevenoddnumbers.IsEven;

public class TestEvenOddNumbers {
    @Test
    public void checkNumber() {
        IsEven isEven = new IsEven();
        System.out.println(isEven.isEven(2));
        System.out.println(isEven.isEven(1));
        System.out.println(isEven.isEven(0));
        System.out.println(isEven.isEven(-2));
    }


}