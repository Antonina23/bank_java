package ageexception;

import ageexception.thisageexception.AgeException;

public class Main {
    public static void main(String[] args) {
        try {
            ageChecker(500);
        } catch (AgeException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void ageChecker(int age) throws AgeException {
        if(age < 0 || age >150) {
            throw new AgeException("Неподходящий возраст");
        }
        System.out.println("Age is: " + age);;
    }
}
