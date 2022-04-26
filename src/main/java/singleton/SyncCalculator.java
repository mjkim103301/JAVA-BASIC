package singleton;

public class SyncCalculator implements Calculation{
    private int result;

    public SyncCalculator() {
        result = 0;
    }
    @Override
    public synchronized void plus(int num) {
        result += num;
    }
    @Override
    public synchronized void minus(int num) {
        result -= num;
    }
    public int getResult() {
        return result;
    }
}
