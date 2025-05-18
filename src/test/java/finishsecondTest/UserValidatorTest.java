package finishsecondTest;

import finishsecond.User;
import finishsecond.UserValidator;
import finishsecond.InvalidUserException;

public class UserValidatorTest {
    public static void main(String[] args) {
        try {
            User validUser = new User("John", 25, "newnew@yandex.com");
            UserValidator.validate(validUser);
            System.out.println("Test 1 is ok: the data is valid");
        } catch (InvalidUserException e) {
            System.out.println("Test 1 is not ok: " + e.getMessage());
        }

        try {
            User invalidNameUser = new User("john", 25, "newnew@yandex.com");
            UserValidator.validate(invalidNameUser);
            System.out.println("Test 2 is not ok: the name is not valid");
        } catch (InvalidUserException e) {
            System.out.println("Test 2 is ok: " + e.getMessage());
        }

        try {
            User invalidAgeUser = new User("John", 5, "newnew@yandex.com");
            UserValidator.validate(invalidAgeUser);
            System.out.println("Test 3 is not ok: the age is not valid");
        } catch (InvalidUserException e) {
            System.out.println("Test 3 is ok: " + e.getMessage());
        }

        try {
            User invalidMailUser = new User("John", 25, "new@yandex");
            UserValidator.validate(invalidMailUser);
            System.out.println("Test 4 is not ok: the email address is not valid");
        } catch (InvalidUserException e) {
            System.out.println("Test 4 is ok: " + e.getMessage());
        }

        try {
            UserValidator.setValidationEnabled(false);
            User invalidUser = new User("john", 16, "wrong-email");
            UserValidator.validate(invalidUser);
            System.out.println("Test 5 is ok: validation has been disabled");
        } catch (InvalidUserException e) {
            System.out.println("Test 5 is not ok: " + e.getMessage());
        }
    }
}
