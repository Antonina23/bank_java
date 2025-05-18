package finishsecond;

public class Main {
    public static void main(String[] args) {
        User validUser = new User("John", 25, "newnew@yandex.com");
        try {
            UserValidator.validate(validUser);
            System.out.println("This user data is valid");
        } catch(InvalidUserException e) {
            System.out.println("The error: " + e.getMessage());
        }

        User invalidUser = new User("sarah", 5, "new@new");
        try {
            UserValidator.validate(invalidUser);
            System.out.println("This user is valid");
        } catch (InvalidUserException e) {
            System.out.println("The error: " + e.getMessage());
        }

    }
}
