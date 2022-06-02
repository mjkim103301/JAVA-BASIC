package lambda.functional_interface;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, String> add=(value)->value+value;
        System.out.println(add.apply("Function Test "));
    }
}
