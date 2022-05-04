package thread;

public class ThreadEx01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("threadEx01 extends Thread" + getName());
        }
    }
}
