package lamdbapredicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> check = x -> x % 2 == 0;

        System.out.println(check.test(5));
        System.out.println(check.test(10));

    }
}
