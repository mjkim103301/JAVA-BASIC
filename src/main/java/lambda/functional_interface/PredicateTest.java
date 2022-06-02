package lambda.functional_interface;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> isSmall = (num) -> num < 10;
        System.out.println("Predicate Test num < 10 = " + isSmall.test(5));
    }
}
