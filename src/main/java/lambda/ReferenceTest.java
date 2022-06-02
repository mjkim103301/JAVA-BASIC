package lambda;

import org.springframework.expression.spel.ast.MethodReference;

public class ReferenceTest {
    public static void main(String[] args) {
        LambdaTest methodReference = (x, y) -> {
            return (int) Math.pow(x, y);
        };
        int c = methodReference.calc(1, 2);

        LambdaTest2 oper;
        oper = (n) -> Math.abs(n);
        System.out.println("What is Math.abs(-5): " + oper.calc(-5));

        oper = Math::abs;
        System.out.println("What is Math::abs(-5): " + oper.calc(-5));

        LambdaTest5 constructor;
        constructor = () -> {
            return new StringBuilder();
        };
        System.out.println(constructor.sb().append("new StringBuilder()"));

        constructor=StringBuilder::new;
        System.out.println(constructor.sb().append("StringBuilder::new"));

    }
}
