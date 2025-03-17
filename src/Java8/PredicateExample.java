package Java8;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> check = num -> num % 2 == 0;

        System.out.println(check.test(4));
        System.out.println(check.test(7));
        System.out.println(check.test(8));
    }
}
