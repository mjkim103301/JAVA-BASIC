package lambda.functional_interface;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Supplier Test";
        System.out.println(supplier.get());
    }
}
