package singleton;

public class Calculator implements Calculation {
    private int result;

    public Calculator() {
        result = 0;
    }
    @Override
    public void plus(int num) {
        result += num;
    }
    @Override
    public void minus(int num) {
        result -= num;
    }

    public int getResult() {
        return result;
    }
}
