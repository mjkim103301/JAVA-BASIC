package singleton;


public class CalcService {
    public void syncCalcRun() {
        SyncCalculator syncCal = new SyncCalculator();
        MinusThread minusThread = new MinusThread(syncCal);
        PlusThread plusThread = new PlusThread(syncCal);
        long start = System.currentTimeMillis();
        try {

            minusThread.start();
            plusThread.start();
            while (minusThread.isAlive() || plusThread.isAlive()) {

            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            long end = System.currentTimeMillis();
            System.out.println("sync result: " + syncCal.getResult());
            System.out.println("sync 수행시간: " + (end - start) + " ms");
        }
    }

    public void noSyncCalcRun() {
        Calculator cal = new Calculator();
        MinusThread minusThread2 = new MinusThread(cal);
        PlusThread plusThread2 = new PlusThread(cal);
        long start2 = System.currentTimeMillis();
        try {
            minusThread2.start();
            plusThread2.start();
            while (minusThread2.isAlive() || plusThread2.isAlive()) {

            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            long end2 = System.currentTimeMillis();
            System.out.println("noSync result: " + cal.getResult());
            System.out.println("noSync 수행시간: " + (end2 - start2) + " ms");
        }
    }
}
