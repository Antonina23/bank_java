package finishsecond;

public class UserValidator {
    public static boolean validationEnabled = true;

    public static void setValidationEnabled(boolean enabled) {
        validationEnabled = enabled;
    }

    public static void validate(User user) {
        if(!validationEnabled) return;

        if(user.getName() == null || user.getName().isEmpty() ||
        !Character.isUpperCase(user.getName().charAt(0))) {
            throw new InvalidUserException("Name should be written with Upper letter");
        }

        if(user.getAge() < 18 || user.getAge() > 100) {
            throw new InvalidUserException("The age should be from 18 to 100");
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if(user.getEmail() == null || !user.getEmail().matches(emailRegex)) {
            throw new InvalidUserException("Wrong format");
        }
    }

}
