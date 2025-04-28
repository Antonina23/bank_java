package testisvalidemailTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testisvalidemail.IsValidEmail;

import java.util.stream.Stream;

public class CheckValidEmailTest {
    private final IsValidEmail checkEmail = new IsValidEmail();

    @Test
    public void testValidEmail() {
        Stream.of("test@example.com", "user.name@domain.co", "a@b.cc")
                .forEach(email -> Assertions.assertTrue(checkEmail.isValidEmail(email)));
    }

    @Test
    public void testNonValidEmail() {
        Stream.of("bad@.com", "no-at-symbol", "@missing-user.com", "user@domain")
                .forEach(email -> Assertions.assertFalse(checkEmail.isValidEmail(email)));
    }

    @Test
    public void testNullEmptyEmail() {
        Stream.of("", null)
                .forEach(email -> Assertions.assertFalse(checkEmail.isValidEmail(email)));
    }
}
