package lambda.functional_interface;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = (str)->System.out.println(str);
        consumer.accept("Consumer Test");
    }
}
