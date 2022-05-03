package singleton;

public class SyncCalculator implements Calculation {
    private int result;

    public SyncCalculator() {
        result = 0;
    }

    @Override
    public synchronized void plus(int num) {
        result += num;
        System.out.println("sync minus result: " + result);
    }

    @Override
    public synchronized void minus(int num) {
        result -= num;
        System.out.println("sync minus result: " + result);
    }

    public int getResult() {
        return result;
    }
}
