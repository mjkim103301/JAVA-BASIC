package thread;

public class ThreadEx02 implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("threadex02 implements Runnable: "+Thread.currentThread().getName());
        }
    }
}
