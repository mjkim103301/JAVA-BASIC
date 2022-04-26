package singleton;

public class Application {
    public static void main(String[] args) {
        SyncCalculator syncCal=new SyncCalculator();
        MinusThread minusThread=new MinusThread(syncCal);
        PlusThread plusThread=new PlusThread(syncCal);
        minusThread.start();
        plusThread.start();
        System.out.println("sync: "+syncCal.getResult());

        Calculator cal=new Calculator();
        MinusThread minusThread2=new MinusThread(syncCal);
        PlusThread plusThread2=new PlusThread(syncCal);
        minusThread2.start();
        plusThread2.start();
        System.out.println("general: "+cal.getResult());
    }
}
