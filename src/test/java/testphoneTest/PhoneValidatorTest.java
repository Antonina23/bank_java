package testphoneTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testphone.PhoneValidator;

public class PhoneValidatorTest {
    private final PhoneValidator validator = new PhoneValidator();

    @Test
    public void testValidNumber() {
        Assertions.assertTrue(validator.isValidPhoneNumber("+1 1234567890"));
        Assertions.assertTrue(validator.isValidPhoneNumber("+44 9876543210"));
        Assertions.assertTrue(validator.isValidPhoneNumber("+999 1111111111"));
    }

    @Test
    public void testNotValidNumber() {
        Assertions.assertFalse(validator.isValidPhoneNumber("12345"));
        Assertions.assertFalse(validator.isValidPhoneNumber("invalid"));
        Assertions.assertFalse(validator.isValidPhoneNumber("+1 abcdefghij"));
        Assertions.assertFalse(validator.isValidPhoneNumber("+1234 1234567890"));
        Assertions.assertFalse(validator.isValidPhoneNumber("+1 123"));
        Assertions.assertFalse(validator.isValidPhoneNumber(""));
    }

    @Test
    public void testNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> validator.isValidPhoneNumber(null));
    }
}
