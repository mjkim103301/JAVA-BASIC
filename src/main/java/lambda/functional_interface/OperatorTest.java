package lambda.functional_interface;

import java.util.function.BinaryOperator;

public class OperatorTest {
    public static void main(String[] args) {
        BinaryOperator append = (x, y) -> x + " " + y;
        System.out.println(append.apply("Operator", "Test"));
    }
}
