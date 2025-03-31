package emailexception;

import emailexception.theemailexception.EmailException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            emailCheck("tone4kawowgmail.com");
        } catch (EmailException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void emailCheck(String email) throws EmailException {
        String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);

        if(!m.matches()) {
            throw new EmailException("Неверный email");
        }
        System.out.println("Email валидный: " + email);
    }

}
