package thread;

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("thread1");

        for (int i = 0; i < 10; i++) {
            System.out.println("thread1 - " + getName());
        }
    }
}