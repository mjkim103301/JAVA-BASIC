package singleton;

public class PlusThread extends Thread {
    private Calculation calc;

    public PlusThread(Calculation calc) {
        this.calc = calc;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            calc.plus(1);
        }
    }
}
