package lambda;

public class Application {
    static void test3(int x, int y, LambdaTest sum) {
        System.out.println("multiply: " + sum.calc(x, y));
    }

    public static void main(String[] args) {
        //매개변수 2개 이상일 때
        LambdaTest sum = (x, y) -> {
            return x + y;
        };
        System.out.println("sum: " + sum.calc(22, 8));

        LambdaTest minus = (x, y) -> {
            return x - y;
        };
        System.out.println("minus: " + minus.calc(22, 8));

        // 매개변수 1개일 때
        LambdaTest2 square = (x) -> {
            return x * x;
        };
        System.out.println("square: " + square.calc(3));

        //매개변수 없을 때
        LambdaTest3 print = () -> System.out.println("hellohello");
        print.print();

        //람다가 매서드의 인자로 전달될 때
        test3(22, 8, sum);

        //제네릭 이용할 때
        LambdaTest4<Integer> test4 = x -> {
            return "스트링 스트링 " + x;
        };
        System.out.println(test4.changeToString(11));

    }
}
