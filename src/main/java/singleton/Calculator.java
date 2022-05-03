package singleton;

public class Calculator implements Calculation {
    private int result;

    public Calculator() {
        result = 0;
    }

    @Override
    public void plus(int num) {
        result += num;
        System.out.println("plus result: " + result);
    }

    @Override
    public void minus(int num) {
        result -= num;
        System.out.println("minus result: " + result);
    }

    public int getResult() {
        return result;
    }
}
